package com.bagal.driver;

import com.bagal.enums.Mode;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public final class DriverFactory {
    private DriverFactory(){}
    private static final Map<Mode, Supplier<WebDriver>> MAP = new HashMap<>();
    static {
        MAP.put(Mode.BS,BSDriverImpl::getDriver);
        MAP.put(Mode.LOCAL,LocalDriverImpl::getDriver);
    }
    public static WebDriver getDriver(Mode mode) {
            return MAP.getOrDefault(mode,LocalDriverImpl::getDriver).get();
    }

}
