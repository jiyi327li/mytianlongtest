package com.tianlong;

/**
 * @Author : tianlong
 * @ClassName :SingletonDemo01
 * @Date 2019/8/30
 * @Description TODO
 */
public class SingletonDemo01 {
    // 类初始化时,会立即加载该对象，线程天生安全,调用效率高
    private static SingletonDemo01 singletonDemo01 = new SingletonDemo01();

    private SingletonDemo01() {
        System.out.println("SingletonDemo01初始化");
    }

    public static SingletonDemo01 getInstance() {
        System.out.println("getInstance");
        return singletonDemo01;
    }

    public static void main(String[] args) {
        SingletonDemo01 s1 = SingletonDemo01.getInstance();
        SingletonDemo01 s2 = SingletonDemo01.getInstance();
        System.out.println(s1 == s2);
    }
}
