package com.javacctvnews.quartz;

/**
 * Created on 2018/4/14.
 */
public class MainTest {
    public static void main(String[] args) {
        TestJob t = new TestJob();
        try {
            t.test();
            t.testParent();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
