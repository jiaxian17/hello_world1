package com.jx.demo;


class HelloWorld {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String  args[]) {


        System.out.println("Hello World");
        System.out.println("你好");
        System.out.println("sout+tab");
        A a = new A();
        System.out.print("兩數之和是："+a.add(1,2));
    }
}

class A{

    int add(int a,int b) {
        return a+b;
    }

}