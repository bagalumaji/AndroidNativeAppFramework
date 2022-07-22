package com.bagal.pages;

import com.bagal.driver.DriverManager;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    protected BasePage(){
        PageFactory.initElements(new AppiumFieldDecorator(DriverManager.getDriver()),this);
    }
}
