package com.tw.com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Computer computer = (Computer) context.getBean("computer");
        System.out.println(computer.showInformation());
    }
}
