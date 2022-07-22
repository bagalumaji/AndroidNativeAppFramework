package com.bagal.driver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.bagal.config.FrameworkConfigFactory.getConfig;

public class LocalDriverImpl{
    public static WebDriver getDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"android");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
        capabilities.setCapability(MobileCapabilityType.APP,System.getProperty("user.dir")+"/src/test/resources/apps/ApiDemos-debug.apk");
        capabilities.setCapability(MobileCapabilityType.UDID,"emulator-5554");
        try {
            return new AndroidDriver<AndroidElement>(getConfig().localServerAddress(), capabilities);
        }catch (Exception e){
            return null;
        }
    }
}
