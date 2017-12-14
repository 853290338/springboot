package com.zhumeng.MongoDB.dao.primary;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.zhumeng.MongoDB.entity.PrimaryMongoObject;

public interface PrimaryRepository extends MongoRepository<PrimaryMongoObject, String> {

}
