package com.tw.com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mouse implements MachineParts {
    @Value("${mouseType}")
    private String mouseType;

    @Override
    public String showType() {
        return this.mouseType;
    }
}
