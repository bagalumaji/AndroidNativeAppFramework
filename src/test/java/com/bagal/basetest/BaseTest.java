package com.bagal.basetest;

import com.bagal.config.FrameworkConfigFactory;
import com.bagal.driver.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    @BeforeMethod
    public void setup(){
        Driver.initDriver(FrameworkConfigFactory.getConfig().mode());
    }

    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }

}
