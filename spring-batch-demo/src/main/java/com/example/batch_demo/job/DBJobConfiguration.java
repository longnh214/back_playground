package com.example.batch_demo.job;


import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class DBJobConfiguration {
    private final JobBuilderFactory jobBuilderFactory;
    private final StepBuilderFactory stepBuilderFactory;

    @Bean("DBJob")
    public Job DBJob(){
        return jobBuilderFactory.get("DBJob")
                .start(step1())
                .next(step2())
                .build();
    }

    @Bean
    public Step step1(){
        return stepBuilderFactory.get("step1")
                .tasklet(((contribution, chunkContext) -> {
                    System.out.println("step1 is run.");
                    return RepeatStatus.FINISHED;
                }))
                .build();
    }

    @Bean
    public Step step2(){
        return stepBuilderFactory.get("step2")
                .tasklet(((contribution, chunkContext) -> {
                    System.out.println("step2 is run.");
                    return RepeatStatus.FINISHED;
                }))
                .build();
    }
}