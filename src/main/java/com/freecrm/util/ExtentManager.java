package com.freecrm.util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {

	public static ExtentReports extent;
	
	public static ExtentReports getInstance(){
		
			if(extent==null){
				return createInstance("test-output/extent.html");
			}else{
				return extent;
			}
	}
	
	public static ExtentReports createInstance(String FileName){
		
		ExtentHtmlReporter htmlReporter=new ExtentHtmlReporter(FileName);
		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setDocumentTitle(FileName);
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setReportName("Automation Test Report");
		
		extent =new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		return extent;
	}
}
