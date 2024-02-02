package com.tudou;

import java.util.Scanner;

/*数字加密
* 某系统的数字密码是一个四位数，如1983，为了安全，需要加密后再传输，加密规则是:对密码中的每位数都加5，
* 再对10求余，最后将所有数字顺序反转，得到一串加密后的新数，请设计出满足本需求的加密程序!
* */
public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入加密的密码：");
        int number = sc.nextInt();
        //int number = 562522;
        int[] numbers = pas(number);
        String minums = encrpt(numbers);
        System.out.println(minums);
    }

    public static String encrpt(int[] numbers) {
        for (int i = 0;i < numbers.length; i++){
            System.out.println(numbers[i]);
            numbers[i] = (numbers[i]+5)%10;
        }
        return reverse(numbers);

    }

    public static int[] pas(int number){
        //定义一个与输入的数字一样长的数组
        int longth = 0;
        int num = number;
        do {
            num = num/10;
            longth++;
        }while (num>0);
        int[] numbers = new int[longth];
        numbers = jiami(numbers,number);
        return numbers;
    }

    public static int[] jiami(int[] numbers, int number) {
            for (int i = 0; i < numbers.length; i++){
                //System.out.println("长度是："+ numbers.length);
                //System.out.println(ciFang((numbers.length)-i));
                //System.out.println("这时候的长度是："+((numbers.length)-i));
                //System.out.println("第"+i+"位数是："+ number/(ciFang((numbers.length)-i)));
                numbers[i] = number/(ciFang((numbers.length)-i));
                number = number%(ciFang((numbers.length)-i));
       }
            return numbers;
    }

    public static int ciFang(int i) {
        int result = 1;
        for (int n = 1; n < i; n++){
            result *= 10;
        }
        //System.out.println("平方几："+result);
        return result;
    }


    public static String reverse(int[] numbers){
        for (int i = 0, j = numbers.length-1; i < j; i++,j--){
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }
        String data = "";
        for (int i = 0;i < numbers.length;i++){
            data += numbers[i];
        }
        return data;
    }
}
