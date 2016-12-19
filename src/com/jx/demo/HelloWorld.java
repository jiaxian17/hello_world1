package com.jx.demo;

/**
 * Created by ibm on 2016/12/19.
 */
public class HelloWorld {
    public static void main(String  args[]) {
        System.out.println("Hello World");
        A a = new A();
        System.out.print("兩數之和是："+a.add(1,2));
    }
}

class A{
    public int add(int a,int b) {
        return a+b;
    }


}