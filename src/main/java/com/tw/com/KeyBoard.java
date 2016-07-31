package com.tw.com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class KeyBoard implements MachineParts{
    @Value("${keyBoardType}")
    private String keyBoardType;

    @Override
    public String showType() {
        return this.keyBoardType;
    }
}
