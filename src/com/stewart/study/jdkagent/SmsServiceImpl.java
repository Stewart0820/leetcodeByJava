package com.stewart.study.jdkagent;

/**
 * @author Stewart
 * @create 2022/1/30
 * @Description
 */
public class SmsServiceImpl implements SmsService {
    @Override
    public String send(String message) {
        System.out.println("send message:" + message);
        return message;
    }
}
