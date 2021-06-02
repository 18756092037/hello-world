package com.example;


import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        System.out.print("N=");
        int total = 10;
        System.out.println("N=" + total + "，打印菱形");
        int i;
        //计算星星从第一行到中间有多少行数
        for (i = 0; i < 100; i++) {
            int old = 2 * (i * i + i) + 1;
            if (old > total) {
                break;
            }
        }
        int column = i + 1;
        int count = 0;
        //星星上部分
        for (i = 1; i < column; i++) {
            for (int j = 1; j < column - i; j++) {
                System.out.print(" ");
            }
            for (int g = 0; g < 2 * i - 1; g++) {
                System.out.print("*");
                count++;
            }
            System.out.println();
        }
        //星星下部分
        for (int h = 1; h < i - 1; h++) {
            for (int q = 0; q < h; q++) {
                System.out.print(" ");
            }
            for (int w = 0; w < 2 * (i - h) - 3; w++) {
                System.out.print("*");
                count++;
            }
            System.out.println();
        }
        System.out.println("剩余*：" + (total - count));
    }


}
