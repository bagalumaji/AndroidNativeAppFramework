package com.bagal.resports;

import com.aventstack.extentreports.ExtentTest;

import java.util.Objects;

public final class ExtentManager {
    private ExtentManager(){}

    public static final ThreadLocal<ExtentTest> THREAD_LOCAL_EXTENT = new ThreadLocal<>();

    static void setExtentTest(ExtentTest extentTest){
        if(Objects.nonNull(extentTest)){
            THREAD_LOCAL_EXTENT.set(extentTest);
        }
    }

    public static ExtentTest getExtentTest(){
        return THREAD_LOCAL_EXTENT.get();
    }

    public static void unload(){
        THREAD_LOCAL_EXTENT.remove();
    }
}
