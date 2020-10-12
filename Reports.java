package com.urbanladder.utils;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.urbanladder.config.Variable;

public class Reports extends Variable{
		
		public static void startTest()
		{
		report = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults.html");
		test = report.startTest("ExtentDemo");
		}
		
	    public static void endTest()
		{
		report.endTest(test);
		report.flush();
		}
	
}
