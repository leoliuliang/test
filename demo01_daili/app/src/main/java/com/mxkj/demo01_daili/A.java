package com.mxkj.demo01_daili;

public class A {
    public void funA(){
        System.out.println(ComposingProxy.obtain().add(3,5));
        System.out.println(ComposingProxy.obtain().text());
    }
}
