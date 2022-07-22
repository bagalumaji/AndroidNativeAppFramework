package com.bagal.pages;

import com.bagal.resports.ExtentLogger;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePage extends BasePage{

    @AndroidFindBy(accessibility = "Views")
    private MobileElement views;

    public void clickOnViews(){
        views.click();
        ExtentLogger.info("clicked on view menu");
    }
}
