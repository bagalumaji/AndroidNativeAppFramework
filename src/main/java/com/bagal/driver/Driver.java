package com.bagal.driver;

import com.bagal.enums.Mode;

import java.util.Objects;

public final class Driver {
    private Driver(){}

    public static void initDriver(Mode mode) {
        if(Objects.isNull(DriverManager.getDriver())){
            DriverManager.setDriver(DriverFactory.getDriver(mode));
        }
    }
    public static void closeDriver(){
        if(Objects.nonNull(DriverManager.getDriver())){
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }
    }
}
