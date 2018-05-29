package com.javacctvnews.task;

import org.quartz.*;

import java.util.Date;

/**
 * Author：chenyanhui
 * Create：2018/4/14 15:51
 * Desc：
 */

public class FirstJobTask implements Job {
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        JobKey key = jobExecutionContext.getJobDetail().getKey();
        String jobName  = key.getName();
        if("jobName_2".equals(jobName)){
            System.out.println("jobName_2定时任务"+new Date());
        }
        if("jobName_1".equals(jobName)){
            System.out.println("jobName_1定时任务"+new Date());
            //System.out.println("1111");
        }
        if("jobName_3".equals(jobName)){
            System.out.println("jobName_3定时任务"+new Date());
           // System.out.println("3333");
        }
    }
}
