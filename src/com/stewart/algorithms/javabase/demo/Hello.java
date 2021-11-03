package com.stewart.algorithms.javabase.demo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Stewart
 * @create 2021/11/3
 */
@Target(value={ElementType.FIELD,ElementType.METHOD})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Hello {
    String value();
}
