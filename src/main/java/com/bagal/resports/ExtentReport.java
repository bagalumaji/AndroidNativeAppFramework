package com.bagal.resports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.bagal.constants.FrameworkConstants;

import java.util.Objects;

public final class ExtentReport {
    private ExtentReport(){}
    private static ExtentReports extentReport;
    public static void initReport(){
        if(Objects.isNull(extentReport)) {
            extentReport = new ExtentReports();
            ExtentSparkReporter sparkReporter = new ExtentSparkReporter(FrameworkConstants.getEXTENT_REPORT_PATH());
            sparkReporter.config().setReportName("Mobile Automation Framework");
            sparkReporter.config().setDocumentTitle("Bagal Testing Framework");
            extentReport.attachReporter(sparkReporter);
        }
    }
    public static void createText(String testcaseName){
        ExtentManager.setExtentTest(extentReport.createTest(testcaseName));
    }

    public static void flushReport(){
        if(Objects.nonNull(extentReport)){
            extentReport.flush();
            ExtentManager.unload();
        }
    }
}
