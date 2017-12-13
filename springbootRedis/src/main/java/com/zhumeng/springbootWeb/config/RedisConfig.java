package com.zhumeng.springbootWeb.config;

import java.lang.reflect.Method;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootConfiguration
@EnableCaching
public class RedisConfig extends CachingConfigurerSupport {

    /**
     * 主键生成策略
     * 重写 CachingConfigurerSupport keyGenerator
     */
    @Bean
    public KeyGenerator keyGenerator() {

        return new KeyGenerator() {

            @Override
            public Object generate(Object target, Method method, Object... params) {

                StringBuilder builder = new StringBuilder();
                builder.append(target.getClass().getName());
                builder.append(method.getName());
                for (Object object : params) {
                    builder.append(object.toString());
                }
                return builder.toString();
            }

        };
    }

    /**
     * 缓存管理
     */
    @SuppressWarnings("rawtypes")
    @Bean
    public CacheManager cacheManager(RedisTemplate redisTemplate) {
        RedisCacheManager cacheManager = new RedisCacheManager(redisTemplate);
        return cacheManager;
    }

    /**
     * RedisTemplate配置
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Bean
    public RedisTemplate<String, String> redisTemplate(RedisConnectionFactory connectionFactory) {
        StringRedisTemplate template = new StringRedisTemplate(connectionFactory);
        Jackson2JsonRedisSerializer jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer(Object.class);
        ObjectMapper om = new ObjectMapper();
        om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
        om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
        jackson2JsonRedisSerializer.setObjectMapper(om);
        template.setValueSerializer(jackson2JsonRedisSerializer);// 如果key是String 需要配置一下StringSerializer,不然key会乱码 /XX/XX
        template.afterPropertiesSet();
        return template;
    }
}
