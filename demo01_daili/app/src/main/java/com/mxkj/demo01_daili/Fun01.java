package com.mxkj.demo01_daili;

public class Fun01 {
    private static Fun01 fun01 = new Fun01();

    private Fun01(){

    }

    public static Fun01 getInstance(){
        return fun01;
    }

    public int add(int a,int b){
        return a+b;
    }

    public String getStr(){
        return "第一次写的代码";
    }
}
