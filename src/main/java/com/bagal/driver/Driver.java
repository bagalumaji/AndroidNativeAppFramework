package com.bagal.driver;

import com.bagal.enums.RunMode;

import java.util.Objects;

public final class Driver {
    private Driver(){}

    public static void initDriver(RunMode runMode) {
        if(Objects.isNull(DriverManager.getDriver())){
            DriverManager.setDriver(DriverFactory.getDriver(runMode));
        }
    }
    public static void closeDriver(){
        if(Objects.nonNull(DriverManager.getDriver())){
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }
    }
}
