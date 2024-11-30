package Saucedemo_Automation.Saucedemo_Automation;

import org.junit.runner.RunWith;
import io.cucumber.junit.*;



@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\java\\Features\\login.feature"},
tags = "@login",
glue = {"StepDef"},
plugin = {"pretty",
		"html:target/cucumber-reports/reports.html"}
)
//me.jvt.cucumber.report.PrettyReports:target/cucumber



public class Test_Runner {

}
