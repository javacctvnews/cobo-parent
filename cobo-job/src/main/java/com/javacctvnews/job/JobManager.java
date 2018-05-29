package com.javacctvnews.job;

import org.quartz.*;

/**
 * Author：chenyanhui
 * Create：2018/4/14 14:51
 * Desc：定时任务的管理，新建，修改，启动，关闭定时任务
 */

public class JobManager {

    /*注入调度器*/
    private Scheduler scheduler;

    public Scheduler getScheduler() {
        return scheduler;
    }
    public void setScheduler(Scheduler scheduler) {
        this.scheduler = scheduler;
    }

    /**
     * 新建job定时任务
     *
     * @param jobName
     * @param jobGroupName
     * @param triggerName
     * @param triggerGroupName
     * @param jobClass
     * @param cron
     * @throws Exception
     */
    public void addJob(String jobName, String jobGroupName, String triggerName, String triggerGroupName, Class jobClass, String cron) throws Exception {
        try {
            // 1.jobDetail
            JobDetail jobDetail = JobBuilder.newJob(jobClass).withIdentity(jobName, jobGroupName).build();

            // 2.trigger
            TriggerBuilder<Trigger> triggerBuilder = TriggerBuilder.newTrigger();
            triggerBuilder.withIdentity(triggerName, triggerGroupName);
            triggerBuilder.startNow();
            // 设置执行规则cron
            triggerBuilder.withSchedule(CronScheduleBuilder.cronSchedule(cron));
            // trigger对象
            CronTrigger trigger = (CronTrigger) triggerBuilder.build();

            // 将任务和触发器设置到调度器中
            scheduler.scheduleJob(jobDetail, trigger);

            // 启动调度器
            if (!scheduler.isShutdown()) {
                scheduler.isStarted();
            }
        } catch (SchedulerException e) {
            e.printStackTrace();
        }


    }


    /**
     * 初始化加载所有的定时任务
     * @throws Exception
     */
    public void startAllJobs() throws  Exception{

    }


}
