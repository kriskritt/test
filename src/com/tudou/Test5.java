package com.tudou;

import java.util.Arrays;
import java.util.Scanner;

/*数组拷贝
* 请把一个整型数组，例如存了数据:11，22，33，拷贝成一个一模一样的新数组出来
* */
public class Test5 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int[] array = backArray(cs);
        //System.out.println(Arrays.toString(array));
        int[] array1 = copyWay(array);
        System.out.println(Arrays.toString(array1));
        System.out.println(array==array1?true:false);
    }

    private static int[] copyWay(int[] array) {
        int[] array2 = new int[array.length];
        for (int i = 0;i < array2.length; i++){
            array2[i] = array[i];
        }
        return array2;
    }

    public static int[] backArray(Scanner cs){
        System.out.println("请输入数组的位数：");
        int n = cs.nextInt();
        int[] array = new int[n];
        for (int i =0;i < n; i++){
            System.out.println("请输入内容：");
            array[i] = cs.nextInt();
        }
        return array;
    }
}
