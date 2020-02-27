package com.deloitte.irs.solutionslab.webapps.prd.solutionslabuserservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SolutionslabUserserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SolutionslabUserserviceApplication.class, args);
	}

}
