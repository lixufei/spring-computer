package com.tw.com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Printer implements MachineParts {
    @Value("${printerType}")
    private String printerType;
    @Override
    public String showType() {
        return this.printerType;
    }
}
