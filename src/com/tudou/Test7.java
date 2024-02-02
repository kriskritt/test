package com.tudou;

import java.util.*;

/*找素数
* 输入两个个数字，算出这个两个数字之间的素数
* 除了1和它本身以外，不能被其他正整数整除，就叫素数
* */
public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入这段数字的开头：");
        int n = sc.nextInt();
        System.out.println("请输入这段数字的结尾：");
        int m = sc.nextInt();
        int[] suShus = array(n,m);
        findSushu(suShus);
        //简洁
        int shu = search(n,m);
        System.out.println("素数一共"+shu);
    }

    public static void findSushu(int[] suShus) {
        int count = 0;
        for (int i = 0; i < suShus.length; i++){
            boolean flag = true;
            for (int j = 2; j < suShus[i]/2;j++){
                if (suShus[i]%j == 0){
                    flag = false;
                    //System.out.println("这时候的i为："+suShus[i]);
                    break;
                }
            }
            if (flag){
                ++count;
                //System.out.println(count);
            }
        }
        System.out.println("一共有"+count+"素数");
    }

    public static int[] array(int n, int m) { //100,200
        //System.out.println("n和m是"+n+","+m);
        List<Integer> array = new ArrayList<>();
        for (int v = n;v<m;v++){
            array.add(v);
            //System.out.println("进来的数组："+Arrays.toString(array.toArray()));
        }
        //System.out.println("进来的数组："+Arrays.toString(array.toArray()));
        Object[] arrays = array.toArray();
        //System.out.println("数组的长度为"+arrays.length);
        int[] sushus = new int[arrays.length];
        for (int i = 0; i < sushus.length; i++){
            //long  w = (long) arrays[i];//使用方式错误
            //sushus[i] = (int) w;
            sushus[i] = Integer.parseInt(arrays[i].toString());
        }
        return sushus;
    }

    public static int search(int start, int end){
        int count = 0;
        for (int i = start; i <= end; i++){
            boolean flag = true;
            for (int j = 2; j <= i/2;j++){
                if (i%j==0){
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.println(i);
                count++;
            }
        }
        return count;
    }
}
