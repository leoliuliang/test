package com.mxkj.demo01_daili;

public class Test {
    public static void main(String[] args) {
        ComposingProxy.init(FunModel02.getInstance());

        tt();

        System.out.println("测试git分支");
        System.out.println("wode分支");
        System.out.println("wode分支");
        System.out.println("wode分支");
        System.out.println("wode分支");
        System.out.println("wode分支");
    }

    private static void tt() {
        A a = new A();
        a.funA();
        B b = new B();
        b.funB();
        C c = new C();
        c.funC();
    }
}
