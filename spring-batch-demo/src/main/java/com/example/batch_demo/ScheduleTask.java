package com.example.batch_demo;

import java.util.HashMap;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameter;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ScheduleTask {

  @Autowired
  JobLauncher jobLauncher;

  @Autowired
  @Qualifier("SimpleJob")
  Job simpleJob;

  @Autowired
  @Qualifier("StepNextJob")
  Job stepNextJob;

  @Autowired
  @Qualifier("DBJob")
  Job dbJob;

  @Autowired
  @Qualifier("StepNextConditionalJob")
  Job stepNextConditionalJob;

  //crontab 방식의 Spring Scheduler
  @Scheduled(cron="0 0 0 * * *", zone="Asia/Seoul")
  public void runSimpleJob() {
    try {
      JobParameter param = new JobParameter(System.currentTimeMillis());
      Map<String,JobParameter> parameters = new HashMap<String,JobParameter>();

      parameters.put("requestDate", param);
      jobLauncher.run(simpleJob, new JobParameters(parameters));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  //fixedRate(일정 주기마다 반복) 방식의 Spring Scheduler
  @Scheduled(fixedRate = 10000)
  public void runStepNextJob() {
    try {
      JobParameter param = new JobParameter(System.currentTimeMillis());
      Map<String,JobParameter> parameters = new HashMap<String,JobParameter>();

      parameters.put("requestDate", param);
      jobLauncher.run(stepNextJob, new JobParameters(parameters));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Scheduled(cron="0 0 0 * * *", zone="Asia/Seoul")
  public void runStepNextConditionalJob() {
    try {
      JobParameter param = new JobParameter(System.currentTimeMillis());
      Map<String,JobParameter> parameters = new HashMap<String,JobParameter>();

      parameters.put("requestDate", param);
      jobLauncher.run(stepNextConditionalJob, new JobParameters(parameters));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Scheduled(fixedRate = -1L)
  public void runDBJob() {
    try {
      JobParameter param = new JobParameter(System.currentTimeMillis());
      Map<String,JobParameter> parameters = new HashMap<String,JobParameter>();

      parameters.put("requestDate", param);
      jobLauncher.run(dbJob, new JobParameters(parameters));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}