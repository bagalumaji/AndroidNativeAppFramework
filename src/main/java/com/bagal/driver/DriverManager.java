package com.bagal.driver;

import org.openqa.selenium.WebDriver;

import java.util.Objects;

public class DriverManager {
    private static final ThreadLocal<WebDriver>THREAD_LOCAL = new ThreadLocal<>();

    public static WebDriver getDriver() {
        return THREAD_LOCAL.get();
    }

    public static void setDriver(WebDriver driver){
        if(Objects.nonNull(driver)){
            THREAD_LOCAL.set(driver);
        }
    }
    public static void unload(){
        THREAD_LOCAL.remove();
    }
}
