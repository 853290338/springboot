package com.zhumeng.MongoDB.properties;

import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@ConfigurationProperties(prefix = "mongodb")
@Component
public class MultipleMongoProperties {

    private MongoProperties primary = new MongoProperties();

    private MongoProperties secondary = new MongoProperties();
}
