package com.stewart.study;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * @author Stewart
 * @create 2022/1/30
 * @Description
 */
public class demo {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("1.0");
        BigDecimal b = new BigDecimal("0.9");
        BigDecimal c = new BigDecimal("0.8");
        BigDecimal x = a.subtract(b);
        BigDecimal y = b.subtract(c);
        System.out.println(Objects.equals(x, y));
    }
}
