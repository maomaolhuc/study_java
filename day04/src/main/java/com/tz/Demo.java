package com.tz;  // java 包   --- window操作系统中 文件夹
import java.util.Scanner;  // 相成 写js的时候 引入的jq src
public class Demo{
    public static void main(String[] args) {
        /*
            流程控制语句
                程序要么是顺序执行的 要么是跳转执行的 要么是循环执行的
                if
                if else
                if else if   互斥的过程
                &&  如果左边false 就不去执行右边了
                &   会计算两边
                没把法把思想变成程序
                switch

         */

        // 如果kip身高有180并且有8块腹肌 那么大西瓜就亲你一下 否则我就亲你一下
        // 1. 身高 几块 条件
        // 2. 满足就亲一下
        // 3. 不满足也踹一下
        // double height = 180;
        // int num = 1;
        // if(height == 180 && num == 1)
        //     System.out.print("大西瓜亲你一下");
        // else
        //     System.out.print("大西瓜踹你一下");

        // int score = 75;
        // 90 --- 优秀
        // 80 --- 90 良好
        // 70 --- 80 一般
        // 60--- 70其他及格

        // if(score >= 90){
        //     System.out.print("good");
        // }else if(score >= 80 && score < 90){
        //     System.out.print("良好");
        // }else if(score >= 70 && score < 80){
        //     System.out.print("一般");
        // }else{
        //     System.out.print("及格");
        // }


        // byte short int String char enum(枚举)
        // boolean long
        // char month = 97;
        // switch(month){
        //     case 'a':
            // case 1:
            // case 2:
                // System.out.print("冬天");
                // break;
            // case 3:
            // case 4:
            // case 5:
            //     System.out.print("春天");
            //     break;
            // case 6:
            // case 7:
            // case 8:
            //     System.out.print("夏天");
            //     break;
            // case 9:
            // case 10:
            // case 11:
            //     System.out.print("秋天");
            //     break;
        // }

        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个月份");
        int month = in.nextInt();
        switch(month){
            case 'a':
            case 1:
            case 2:
                System.out.print("冬天");
                break;
            case 3:
            case 4:
            case 5:
                System.out.print("春天");
                break;
            case 6:
            case 7:
            case 8:
                System.out.print("夏天");
                break;
            case 9:
            case 10:
            case 11:
                System.out.print("秋天");
                break;
            default:
                System.out.print("请输入合法的月份");
                break;
        }

    }
}