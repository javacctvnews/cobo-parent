package com.javacctvnews.quartz;

import org.quartz.Job;

/**
 * Created on 2018/4/14.
 */
public abstract class MyJob implements Job{

    public void testParent() throws Exception {
        System.out.println("抽象父类的一个方法");
    }
}
