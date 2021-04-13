package com.mxkj.demo01_daili;

public class ComposingProxy implements IComposing {
    private static ComposingProxy mComPro  = new ComposingProxy();

    private ComposingProxy(){}

    public static ComposingProxy obtain(){
        return mComPro;
    }

    private static IComposing mIcom = null;

    public static void init(IComposing iCom){
        mIcom = iCom;
    }


    @Override
    public int add(int a,int b) {
        return mIcom.add(a,b);
    }

    @Override
    public String text() {
        return mIcom.text();
    }
}
