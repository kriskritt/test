package com.tudou;

import java.util.Random;
import java.util.Scanner;

/*抢红包
* 一个大V直播时发起了抢红包活动，分别有:9、666、188、520、99999五个红包。
* 请模拟粉丝来抽奖，按照先来先得随机抽取，抽完即止，注意:一个红包只能被抽一次人
* 先抽或后抽哪一个红包是随机的，示例如下(不一定是下面的顺序)
* */
public class Test6 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("请你输入红包的数量：");
        int n = cs.nextInt();
        int[] hongBao = luckyMa(cs,n);
        //System.out.println(Arrays.toString(hongBao));
        //抽奖
        Random r = new Random();
        chouJiang(r,hongBao,cs);
        System.out.println("红包已被抢完");
    }

    public static void chouJiang(Random r, int[] hongBao,Scanner cs) {
        for (int n = 0; n < hongBao.length; n++){
            System.out.println("请你输入名称进行抽奖：");
            String name = cs.next();
            while (true){
                int index = r.nextInt(hongBao.length);
                int money = hongBao[index];
                if (money != 0){
                    System.out.println(name+"抽到了"+money+"块钱红包");
                    hongBao[index]=0;
                    break;
                }
            }
        }
    }

    //发红包
    public static int[] luckyMa(Scanner cs,int n) {
        int[] hongBao = new int[n];
        for (int i = 0; i < hongBao.length ;i++){
            System.out.println("请输入第"+(i+1)+"个红包金额");
            hongBao[i] = cs.nextInt();
        }
        return hongBao;
    }

}
