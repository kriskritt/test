package com.tudou;

import java.util.Random;

/*开发验证码
* 开发一个程序，可以生成指定位数的验证码，每位可以是数字，大小写字母。
* */
public class Test2 {
    public static void main(String[] args) {
        System.out.println(createCode(6));
    }

    public static String createCode(int x){
        //通过产生随机数，去获取数字、大写字母和小写字母
        Random r = new Random();
        //定义一个返回的验证码数据
        String code = "";
        //通过传入的参数来决定获取几次随机值
        for (int i = 1; i <= x; i++){
            //将每一个输出的验证码分为三类
            int type = r.nextInt(3);
            switch (type){
                case 0:
                    code += r.nextInt(10); //0-9
                    break;
                case 1:
                    code += (char)(r.nextInt(65)+26); //大写英文字母是从65-90
                    break;
                case 2:
                    code += (char)(r.nextInt(97)+26); //小写英文字母是从97-122
                    break;
            }
        }
        return code;
    }
}
