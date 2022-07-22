package com.bagal.config;

import com.bagal.convertors.StringToModeTypesConvertor;
import com.bagal.convertors.StringToUrlConvertor;
import com.bagal.enums.RunMode;
import org.aeonbits.owner.Config;

import java.net.URL;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file://${user.dir}/src/test/resources/configs/config.properties"
})
public interface FrameworkConfig extends Config {

    @ConverterClass(value = StringToModeTypesConvertor.class)
    RunMode mode();

    String platformName();

    String automationName();

    @ConverterClass(value = StringToUrlConvertor.class)
    @Key("localServerAddress")
    URL localServerAddress();
}
