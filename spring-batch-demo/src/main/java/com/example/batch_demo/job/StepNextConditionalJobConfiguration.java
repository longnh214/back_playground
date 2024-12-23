package com.example.batch_demo.job;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
@RequiredArgsConstructor
public class StepNextConditionalJobConfiguration {
  private final JobBuilderFactory jobBuilderFactory;
  private final StepBuilderFactory stepBuilderFactory;
  private static final String JOB_NAME = "StepNextConditionalJob";

  @Bean(JOB_NAME)
  public Job stepNextConditionalJob(){
    return jobBuilderFactory.get("stepNextConditionalJob")
        .start(conditionalJobStep1())
          .on("FAILED") //FAILED 상태라면
          .to(conditionalJobStep3()) //다음 Step3로
          .on("*")
          .end()
        .from(conditionalJobStep1())
          .on("*") //FAILED 이외의 상태라면
          .to(conditionalJobStep2()) //Step2를 진행하고
          .next(conditionalJobStep3()) //이후에 Step3도 진행한다.
          .on("*")
          .end()
        .end()
        .build();
  }

  @Bean
  public Step conditionalJobStep1(){
    return stepBuilderFactory.get("step1")
        .tasklet(((contribution, chunkContext) -> {
          log.info("This is stepNextConditionalJob Step1");
          contribution.setExitStatus(ExitStatus.FAILED);
          return RepeatStatus.FINISHED;
        })).build();
  }

  @Bean
  public Step conditionalJobStep2(){
    return stepBuilderFactory.get("step2")
        .tasklet(((contribution, chunkContext) -> {
          log.info("This is stepNextConditionalJob Step2");
          return RepeatStatus.FINISHED;
        })).build();
  }

  @Bean
  public Step conditionalJobStep3(){
    return stepBuilderFactory.get("step3")
        .tasklet(((contribution, chunkContext) -> {
          log.info("This is stepNextConditionalJob Step3");
          return RepeatStatus.FINISHED;
        })).build();
  }
}