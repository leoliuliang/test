package com.mxkj.demo01_daili;

public class B {
    public void funB(){
        System.out.println(ComposingProxy.obtain().add(8,8));
        System.out.println(ComposingProxy.obtain().text());
    }
}
