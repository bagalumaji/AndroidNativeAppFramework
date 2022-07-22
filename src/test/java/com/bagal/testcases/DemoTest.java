package com.bagal.testcases;

import com.bagal.basetest.BaseTest;
import com.bagal.pages.HomePage;
import org.testng.annotations.Test;

public class DemoTest extends BaseTest {
    @Test
    public void demoTest() {
        new HomePage().clickOnViews();
    }
}
