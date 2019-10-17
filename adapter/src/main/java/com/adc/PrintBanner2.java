package com.adc;

/**
 * adapter -- 适配器
 * 对象适配器模式 -- 基于组合
 */
public class PrintBanner2 implements Print {

    private Banner banner;

    public PrintBanner2(Banner banner) {
        this.banner = banner;
    }


    @Override
    public void printWeak(String content) {
        banner.showWithParen(content);
    }

    @Override
    public void printStrong(String content) {
        banner.showWithAster(content);
    }
}
