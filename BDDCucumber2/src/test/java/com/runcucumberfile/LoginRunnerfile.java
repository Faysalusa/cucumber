package com.runcucumberfile;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


	
	@CucumberOptions(
			features="./HomeFeature.feature",
			glue="com.stepDefinition",
			monochrome=true,
		plugin= {"html:terget/cucumber.html"}
			
			
			)


	public class LoginRunnerfile extends AbstractTestNGCucumberTests{

	

	}
	
	


