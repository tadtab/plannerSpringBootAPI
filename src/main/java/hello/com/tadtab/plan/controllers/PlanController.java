package com.tadtab.plan.controllers;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tadtab.plan.pojo.Plan;
import com.tadtab.plan.service.PlanService;

/**
 * 
 * controller to manage the plan object persistance
 *
 * @author tadtab
 * @version Apr 12, 2020
 *
 */
@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping(value="plan")
public class PlanController
{
    
    @Autowired
    private PlanService planService;
    
    @CrossOrigin(origins = "https://planner2020.s3.amazonaws.com")
    @RequestMapping(value="/save", method =  RequestMethod.POST)
    public String savePlan(@RequestBody Plan plan) {
     
        return planService.persistPlan(plan);
    }
    
    @RequestMapping("/get")
    public List<Plan> greeting() {
        return planService.getAllPlan();
    }

}
