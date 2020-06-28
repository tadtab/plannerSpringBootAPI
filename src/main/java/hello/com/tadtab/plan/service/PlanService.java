package com.tadtab.plan.service;

import java.util.List;

import com.tadtab.plan.pojo.Plan;

/**
 * 
 * Write a one-sentence summary of your class here.
 * Follow it with additional details about its purpose
 * and how to use it.
 *
 * @author tadtab
 * @version Apr 20, 2020
 *
 */
public interface PlanService
{
    public String persistPlan(Plan plan);
    public List<Plan> getAllPlan();
}
