package com.tw.com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Display implements MachineParts{

    @Value("${displayType}")
    private String displayType;

    @Override
    public String showType() {
        return this.displayType;
    }
}
