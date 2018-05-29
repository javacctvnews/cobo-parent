package com.javacctvnews.quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * Created on 201/4/14.
 */
public class TestJob extends MyJob {


    public void test() throws Exception {
        System.out.println("继承抽象父类的一个方法");
    }

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("quartz");
    }
}
