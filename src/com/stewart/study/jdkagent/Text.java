package com.stewart.study.jdkagent;

/**
 * @author Stewart
 * @create 2022/1/30
 * @Description
 */
public class Text {
    public static void main(String[] args) {
        SmsService smsService = (SmsService) JdkProxyFactory.getProxy(new SmsServiceImpl());
        smsService.send("hello");
    }
}
