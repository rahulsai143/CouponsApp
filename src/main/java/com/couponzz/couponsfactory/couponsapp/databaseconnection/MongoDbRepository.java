package com.couponzz.couponsfactory.couponsapp.databaseconnection;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.couponzz.couponsfactory.couponsapp.models.UserSchema;

public interface MongoDbRepository extends MongoRepository<UserSchema, Integer> {

}
