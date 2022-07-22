package com.bagal.constants;

import lombok.Getter;

public final class FrameworkConstants {
    private FrameworkConstants(){}

    public  @Getter static final String EXTENT_REPORT_PATH=System.getProperty("user.dir") + "/target/extent-report/index.html";
}
