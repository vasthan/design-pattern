package com.adc;

/**
 * adapter -- 适配器
 * 类适配器模式 -- 基于继承
 */
public class PrintBanner1 extends Banner implements Print{

    @Override
    public void printWeak(String content) {
        super.showWithParen(content);
    }

    @Override
    public void printStrong(String content) {
        super.showWithAster(content);
    }
}
