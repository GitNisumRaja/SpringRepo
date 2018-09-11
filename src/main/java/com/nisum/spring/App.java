package com.nisum.spring;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/java/com/nisum/cfg/simple-job.xml");
    	
    	JobLauncher jobLauncher = (JobLauncher) ctx.getBean("jobLauncher");
    	Job job = (Job) ctx.getBean("mySimpleJob");
    	JobExecution execution = null;
    	
    	try {
			execution = jobLauncher.run(job, new JobParameters());
			System.out.println("Job Exist Status:: "+ execution.getStatus());
		} catch (JobExecutionAlreadyRunningException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JobRestartException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JobInstanceAlreadyCompleteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JobParametersInvalidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
