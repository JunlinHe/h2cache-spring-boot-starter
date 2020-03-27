package com.hyf.cache.properties;

import com.hyf.cache.polo.RedisDefault;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Howinfun
 * @desc
 * @date 2020/3/27
 */
@Data
@ConfigurationProperties("h2cache.service.redis")
public class H2CacheRedisProperties {

    private RedisDefault defaultConfig;
}
