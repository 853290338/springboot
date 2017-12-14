package com.zhumeng.MongoDB.dao.secondary;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.zhumeng.MongoDB.entity.SecondMongoObject;

public interface SecondRepository extends MongoRepository<SecondMongoObject, String> {

}
