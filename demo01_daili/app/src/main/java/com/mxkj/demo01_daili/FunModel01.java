package com.mxkj.demo01_daili;

public class FunModel01 implements IComposing {
    @Override
    public int add(int a,int b) {
        return a+b;
    }

    @Override
    public String text() {
        return "重构之后的 01 ";
    }
}
