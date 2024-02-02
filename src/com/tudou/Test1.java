package com.tudou;

/*买飞机票
* 用户购买机票时，机票原价会按照淡季、旺季，头等舱还是经济舱的情况进行相应的优惠，优惠方案如下:5-10月为旺季，
* 头等舱9折，经济舱8.5折;11月到来年4月为淡季，头等舱7折，经济舱6.5折请开发程序计算出用户当前机票的优惠价。
* */

public class Test1 {
    public static void main(String[] args) {
        System.out.println(counttick(7, "头等舱", 1200));
    }

    public static double counttick(int season, String leve, double price){
        // 1、判断是否为旺季
        if (season >= 5 && season <= 10){
            switch (leve){
                case "头等舱":
                    price *= 0.9;
                    break;
                case "经济舱":
                    price *= 0.85;
                    break;
            }
        }else {
            switch (leve){
                case "头等舱":
                    price *= 0.7;
                    break;
                case "经济舱":
                    price *= 0.65;
                    break;
            }
        }
        return price;
    }
}
