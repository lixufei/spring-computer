package com.tw.com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Host implements MachineParts {

    @Value("${hostType}")
    private String hostType;

    @Override
    public String showType() {
        return this.hostType;
    }
}
