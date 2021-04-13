package com.mxkj.demo01_daili;

public class FunModel02 implements IComposing{
    private static FunModel02 fun01 = new FunModel02();

    private FunModel02(){

    }

    public static FunModel02 getInstance(){
        return fun01;
    }

    @Override
    public int add(int a,int b){
        return a*b;
    }

    @Override
    public String text() {
        return " 重构之后------------02";
    }
}
