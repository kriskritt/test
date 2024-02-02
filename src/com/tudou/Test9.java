package com.tudou;
/*
九九乘法表
* */
public class Test9 {
    public static void main(String[] args) {
        for (int i = 1;i <= 9;i++){
            for (int j = 1;j<= i;j++){
                System.out.println(j + "X" + i + "=" + (j*i) + "\t");
            }
            System.out.println(i);
        }
    }
}
