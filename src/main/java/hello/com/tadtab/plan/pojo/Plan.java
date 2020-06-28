package com.tadtab.plan.pojo;

import java.util.Date;

import org.springframework.data.annotation.Id;


/**
 * 
 * This is the plan object that has the name, point, description, start and end date
 *
 * @author tadtab
 * @version Apr 12, 2020
 *
 */
public class Plan
{
    @Id
    private int id;
    private String planName; 
    private int planPoint;
    private String description; 
    private Date planStartDate;
    
    /**
     * @return the planName
     */
    public String getPlanName()
    {
        return planName;
    }
    /**
     * @param planName the planName to set
     */
    public void setPlanName(String planName)
    {
        this.planName = planName;
    }
    /**
     * @return the planPoint
     */
    public int getPlanPoint()
    {
        return planPoint;
    }
    /**
     * @param planPoint the planPoint to set
     */
    public void setPlanPoint(int planPoint)
    {
        this.planPoint = planPoint;
    }
    /**
     * @return the description
     */
    public String getDescription()
    {
        return description;
    }
    /**
     * @param description the description to set
     */
    public void setDescription(String description)
    {
        this.description = description;
    }
    /**
     * @return the planStartDate
     */
    public Date getPlanStartDate()
    {
        return planStartDate;
    }
    /**
     * @param planStartDate the planStartDate to set
     */
    public void setPlanStartDate(Date planStartDate)
    {
        this.planStartDate = planStartDate;
    }
    /**
     * @return the id
     */
    public int getId()
    {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(int id)
    {
        this.id = id;
    }
    
    
    

}
