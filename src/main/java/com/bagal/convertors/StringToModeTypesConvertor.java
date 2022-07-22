package com.bagal.convertors;

import com.bagal.enums.RunMode;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public class StringToModeTypesConvertor implements Converter<RunMode> {
    @Override
    public RunMode convert(Method method, String value) {
        return RunMode.valueOf(value.toUpperCase());
    }
}
