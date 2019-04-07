package com.sirniclolas.spring.beans;

public class HelloWorld {
    private String name;
    private String name2;
    private int abc;
    //spring容器只调用一次构造函数
    public HelloWorld(String string){
        System.out.println("HelloWorld's  has params Constructor......");
    }

    public HelloWorld() {
        System.out.println("HelloWorld's Constructor......");
    }

    public void setName(String name) {
        System.out.println("setName: "+name);
        this.name=name;
    }
    public void setName2(String name2) {
        System.out.println("setName2: "+name2);
        this.name2 = name2;
    }
    public void setAbc(int abc) {
        System.out.println("setAbc ："+abc);
        this.abc = abc;
    }

    public void hello(){
        System.out.println("hello:  " + name+"\n"+"hello: "+name2+"\n"+"hello: "+ abc);
    }
}
