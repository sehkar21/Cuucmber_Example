package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "S:\\New folder\\projectworkplace\\Cucumber_Example\\features\\Login.feature",
		glue = {"com.Stepdefinitions"},
		dryRun=false,
		plugin={"pretty:target/cucumber-htmlreport.text", "json:target/cucmber-report.json","io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm"},
		monochrome=true,
		tags = {"@sprint1 , @sprint2, @sprint3"}
			
		)

public class TestRunner {

	
}