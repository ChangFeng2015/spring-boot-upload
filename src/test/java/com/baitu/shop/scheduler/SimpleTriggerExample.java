//package com.baitu.shop.scheduler;
//
//import org.quartz.*;
//import org.quartz.impl.StdScheduler;
//import org.quartz.impl.StdSchedulerFactory;
//
//public class SimpleTriggerExample {
//    public static void main(String[] args) throws SchedulerException {
//        String jobName = "helloTest";
//        String jobGroup = "testGroup_1";
//
//        JobDetail jobDetail = JobBuilder.newJob(HelloJobSub.class)
//                .withIdentity(jobName,jobGroup).setJobData()
//                .build();
//        Trigger trigger = TriggerBuilder
//                .newTrigger()
//                .withIdentity(jobName,jobGroup)
//                .withSchedule(SimpleScheduleBuilder.simpleSchedule()
//                .withIntervalInSeconds(5).repeatForever())
//                .build();
//
//        Scheduler scheduler = new StdSchedulerFactory().getScheduler();
//        scheduler.start();
//        scheduler.scheduleJob(jobDetail, trigger);
//    }
//}
