package com.zhumeng.shiro.config;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

import com.zhumeng.shiro.shiro.MyShiroRealm;

@SpringBootConfiguration
public class ShiroConfig {

    @Bean
    public ShiroFilterFactoryBean factoryBean(SecurityManager manager) {

        ShiroFilterFactoryBean bean = new ShiroFilterFactoryBean();
        bean.setSecurityManager(manager);
        // 拦截器
        Map<String, String> filterChainDefinitionMap = new LinkedHashMap<String, String>();
        // 配置不会被拦截的链接，顺序判断
        filterChainDefinitionMap.put("/static/**", "anon");
        // 退出
        filterChainDefinitionMap.put("/logout", "logout");
        filterChainDefinitionMap.put("/**", "authc");

        bean.setLoginUrl("/login");
        bean.setSuccessUrl("/index");

        bean.setUnauthorizedUrl("/403");
        bean.setFilterChainDefinitionMap(filterChainDefinitionMap);
        return bean;
    }

    @Bean
    public MyShiroRealm myShiroRealm() {
        MyShiroRealm myShiroRealm = new MyShiroRealm();
        return myShiroRealm;
    }

    @Bean
    public SecurityManager securityManager() {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(myShiroRealm());
        return securityManager;
    }
}
