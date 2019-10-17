package com.adc;

/**
 * client
 */
public class Main {
    public static void main(String[] args) {
        Print p1 = new PrintBanner1();
        p1.printWeak("hello");
        p1.printStrong("hello");

        Print p2 = new PrintBanner2(new Banner());
    }
}
