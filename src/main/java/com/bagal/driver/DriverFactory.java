package com.bagal.driver;

import com.bagal.enums.RunMode;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public final class DriverFactory {
    private DriverFactory(){}
    private static final Map<RunMode, Supplier<WebDriver>> MAP = new HashMap<>();
    static {
        MAP.put(RunMode.BS,BSDriverImpl::getDriver);
        MAP.put(RunMode.LOCAL,LocalDriverImpl::getDriver);
    }
    public static WebDriver getDriver(RunMode runMode) {
            return MAP.getOrDefault(runMode,LocalDriverImpl::getDriver).get();
    }

}
