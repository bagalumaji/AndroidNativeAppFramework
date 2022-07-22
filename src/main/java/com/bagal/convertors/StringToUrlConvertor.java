package com.bagal.convertors;

import lombok.SneakyThrows;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;
import java.net.URL;

public class StringToUrlConvertor implements Converter<URL> {
    @Override
    @SneakyThrows
    public URL convert(Method method, String url) {
        return new URL(url);
    }
}
