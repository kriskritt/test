package com.tudou;

import java.util.Scanner;

/*
       *
      ***
     *****
本质: 计算机本质只能打印行，所以按照行思考。先找规律，再写程序
* 行（i）     先打空格(n)   再打星星(1+)   换行
* 1            3         1
* 2            2         3
* 3            1         7
* */
public class Test10 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        int m = n;
        for (int i = 0; i <= n;i++){
            for (int a = 0; a<m-i;a++){
                //System.out.println("打印出a:"+a);
                System.out.print(" ");
            }
            //int count = 1;
            for (int b=1;b<=2*i-1;b++){
                System.out.print('*');
                //count++;
            }
            //System.out.println(count);
            System.out.println('\n');
        }

    }

}
