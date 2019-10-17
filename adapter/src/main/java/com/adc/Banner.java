package com.adc;

/**
 * adaptee -- 被适配对象
 */
public class Banner {

    public void showWithParen(String content) {
        System.out.println("(" + content + ")");
    }

    public void showWithAster(String content) {
        System.out.println("*" + content + "*");
    }
}
