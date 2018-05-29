package com.javacctvnews;

import com.javacctvnews.job.JobManager;
import com.javacctvnews.task.FirstJobTask;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.UUID;

/**
 * Author：chenyanhui
 * Create：2018/4/14 15:50
 * Desc：
 */

public class MainTest {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:cobo-quartz.xml");
        JobManager jobManager = applicationContext.getBean(JobManager.class);
        //JobManager jobManager = new JobManager();
        //String jobName1 = getJobName();
        //String jobName2 = getJobName();
        try {
            for (int i=1;i<=3;i++){
                jobManager.addJob("jobName_"+i, "firstGroup", "Trigger_"+i, "triggerGroup01", FirstJobTask.class, "*/"+i*10+" * * * * ?");
                System.out.println("cron:"+"*/"+i*10+" * * * * ?");
                System.out.println("jobName:"+"jobName_"+i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String getJobName() {
        UUID jobName = UUID.randomUUID();
        return jobName.toString();
    }


}
