package com.tadtab.plan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tadtab.plan.pojo.Plan;
import com.tadtab.plan.repository.PlanRepo;

@Service
public class PlanServiceImpl implements PlanService
{
    @Autowired
    private PlanRepo planRepo;
    
    @Override
    public String persistPlan(Plan plan) {
        Integer intID = generatePlanId();
        plan.setId(intID);
        planRepo.save(plan);
        
        return "Plan saved";
    }
    @Override
    public List<Plan> getAllPlan(){
       return planRepo.findAll();
    }
    private int generatePlanId() {
        Double doubleId = Math.random()*10000;
        return doubleId.intValue();
    }

}
