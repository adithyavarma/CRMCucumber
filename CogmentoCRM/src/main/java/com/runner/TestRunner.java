package com.runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:/Users/admin/eclipse-workspace/CogmentoCRM/src/main/java/com/features/login.feature",
		glue= {"com.stepDefinition"},
		plugin= {"pretty","html:target/test-output"}
	)	

public class TestRunner {
 
}
