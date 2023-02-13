package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.testng.CucumberOptions;
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\newas\\eclipse-workspace\\CucumberFramework\\Features\\LoginFeature.feature",
		glue = "StepDefination",
		dryRun = false,
		tags = "@Sanity",
		monochrome = true,
		// plugin = {"pretty","html:target/cucumber-reports/reports_html.html",
		// "json:target/cucumber-reports/reports_json.json",
		// "junit:target/cucumber-reports/reports_xml.xml"}
		plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })

//plugin = {"pretty","html:target/cucumber-reports/reports_html.html"} >> for html
//plugin = {"pretty","json:target/cucumber-reports/reports_json.json"} >> for json
//plugin = {"pretty","junit:target/cucumber-reports/reports_xml.xml"} >> for xml

public class Run extends AbstractTestNGCucumberTests {
// This class will be empty
}
