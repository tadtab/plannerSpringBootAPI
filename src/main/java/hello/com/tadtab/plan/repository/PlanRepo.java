package com.tadtab.plan.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import com.tadtab.plan.pojo.Plan;

/**
 * 
 * interface to save plan object
 *
 * @author tadtab
 * @version Apr 12, 2020
 *
 */
public interface PlanRepo extends MongoRepository<Plan, Integer>
{

}
