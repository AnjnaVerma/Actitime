package com.actitime.login;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Demo {

	@Test
	public void login()
	{
		
		System.out.println("Login to ActiTime");
ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Reports/learn_Automation.html");
ExtentReports extent=new ExtentReports();
extent.attachReporter(reporter);
ExtentTest logger = extent.createTest("login");
logger.log(Status.INFO, "Login to ActiTime");
//logger.log(Status.FAIL, "Login failed");

		
	}
}
