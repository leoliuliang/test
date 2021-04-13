package com.mxkj.demo01_daili;

/**
 * 取名为Composing，是因为在做vivo输入法项目时重构拼音串和云词时发现耦合度太高
 * 所以建这个demo程序来学习用代理模式来重构代码。
 * 如果之前的代码没考虑到设计模式，A/B/C三个类都调用了Fun01的功能，现在Fun01不满足需求，要求用新类Fun02来进行新版本迭代。
 * 如果直接修改，需要修改A/B/C甚至更多地方的代码。
 * */
public interface IComposing {
    int add(int a,int b);
    String text();
}
