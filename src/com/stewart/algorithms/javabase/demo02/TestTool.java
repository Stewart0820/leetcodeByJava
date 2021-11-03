package com.stewart.algorithms.javabase.demo02;

/**
 * @author Stewart
 * @create 2021/11/3
 *
 * 可以通过反射获取注解的方法，来进行对方法的测试
 */
import java.lang.reflect.Method;
import java.util.HashMap;

public class TestTool {
    public static void main(String[] args) throws ClassNotFoundException {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("name", 1);
        // TODO Auto-generated method stub
        //可以new一个对象找到这个类
        NoBug testobj = new NoBug();
        //也可以通过路径找到
        Class clazz = Class.forName("com.stewart.algorithms.javabase.demo02.NoBug");
//        Class clazz = testobj.getClass();
        Method[] method = clazz.getDeclaredMethods();
        //用来记录测试产生的 log 信息
        StringBuilder log = new StringBuilder();
        // 记录异常的次数
        int errornum = 0;
        for ( Method m: method ) {
            // 只有被 @Jiecha 标注过的方法才进行测试
            if ( m.isAnnotationPresent( Jiecha.class )) {
                try {
                    m.setAccessible(true);
                    m.invoke(testobj, null);
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    //e.printStackTrace();
                    errornum++;
                    log.append(m.getName());
                    log.append(" ");
                    log.append("has error:");
                    log.append("\n\r  caused by ");
                    //记录测试过程中，发生的异常的名称
                    log.append(e.getCause().getClass().getSimpleName());
                    log.append("\n\r");
                    //记录测试过程中，发生的异常的具体信息
                    log.append(e.getCause().getMessage());
                    log.append("\n\r");
                }
            }
        }
        log.append(clazz.getSimpleName());
        log.append(" has  ");
        log.append(errornum);
        log.append(" error.");
        // 生成测试报告
        System.out.println(log.toString());
    }
}

