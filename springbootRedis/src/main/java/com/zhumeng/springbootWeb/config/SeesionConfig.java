package com.zhumeng.springbootWeb.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootConfiguration
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 86400 * 30)
public class SeesionConfig {

}
