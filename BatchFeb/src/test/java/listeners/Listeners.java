package listeners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import base.TestBase;
import testcases.LogTest;

public class Listeners extends TestBase implements ITestListener {
	public Logger log = LogManager.getLogger(LogTest.class.getName());
	
	public void onFinish(ITestContext Result) {
		log.info("On Finish: " + Result.getName());
	}

	public void onStart(ITestContext Result) {
		log.info("On Start: " + Result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {

	}

	// When Test case get failed, this method is called.
	public void onTestFailure(ITestResult Result) {
		log.error("The name of the testcase failed is :" + Result.getName());
	}

	// When Test case get Skipped, this method is called.
	public void onTestSkipped(ITestResult Result) {
		log.error("The name of the testcase Skipped is :" + Result.getName());
	}

	// When Test case get Started, this method is called.
	public void onTestStart(ITestResult Result) {
		log.info(Result.getName() + " test case started");
	}

	// When Test case get passed, this method is called.
	public void onTestSuccess(ITestResult Result) {
		log.info("The name of the testcase passed is :" + Result.getName());
	}
}
