package com.tudou;

import java.util.Scanner;

/*评委打分
* 在唱歌比赛中，可能有多名评委要给选手打分，分数是[0 - 100]之间的整数。
* 选手最后得分为:去掉最高分、最低分后剩余分数的平均分，请编写程序能够录入多名评委的分数，并算出选手的最终得分
* */
public class Test3 {
    public static void main(String[] args) {
        System.out.println(getAverageScore(8));
    }
    public static double getAverageScore(int number){
        // 1.定义一个动态初始化的数组
        double[] scores = new double[number];
        // 2.遍历数组来录入评委评分
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++){
            System.out.println("请你录入第"+ (i+1) +"个评委的评分：");
            double score = sc.nextDouble();
            scores[i] = score;
            //System.out.println(scores[i]);
        }
        // 3.通过数组遍历来做运算
        double sum = 0;
        double max = scores[0];
        double min = scores[0];

        //遍历数组
        for (int i = 0; i < scores.length; i++){
            //求和
            sum += scores[i];
            //求最大值
            if (max < scores[i]){
                max = scores[i];
            }
            //求最小值
            if (min > scores[1]){
                min = scores[i];
            }
        }
        return 1.0 * (sum - min - max) / (number-2);
    }
}
