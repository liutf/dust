package com.dust.other;

import org.junit.Test;

/**
 * FileName: AliJieBei
 * Description:
 * Version: v1.0.0
 * Author: liutf
 * Date: 2016-12-06
 */
public class AntJieBei {

    @Test
    public void test(){
//        1：每月月供额＝(贷款本金÷还款月数)＋(贷款本金－已归还本金累计额)×月利率
//        2：每月应归还本金＝贷款本金÷还款月数
//        3：月利率＝日利率×30
        double bCapital = 48000;//贷款本金
        int bMonth = 12; //月数
        double rate = 0.0003; //日利率
        double rePayed = 0; //已还本金

        for (int i = 1; i <= bMonth; i++) {

            System.out.println("------------------------------------");

            System.out.println("贷款本金：" + bCapital + "  已还本金：" + rePayed);

            double reStore = bCapital / 12; //偿还本金
            double interest = (bCapital - rePayed) * rate * 30; //月利息
            double repayAmount = reStore + interest; //还款总额

//            System.out.println("第" + i + "本金：" + reStore);
            System.out.println("第" + i + "月利息：" + interest);
            System.out.println("第" + i + "期还款总额为：" + repayAmount);

            rePayed += reStore;

        }

        System.out.println(rePayed);
    }

}
