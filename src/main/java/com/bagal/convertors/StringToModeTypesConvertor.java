package com.bagal.convertors;

import com.bagal.enums.Mode;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public class StringToModeTypesConvertor implements Converter<Mode> {
    @Override
    public Mode convert(Method method, String value) {
        return Mode.valueOf(value.toUpperCase());
    }
}
