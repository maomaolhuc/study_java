package com.tz;

public class Demo01{
    public static void main(String[] args) {
        /*
            循环
                for
                while(true/false){

                }
                do...while(true/false);
         */

        // int i;
        // for(i=0;i<10;i++;){
        //     // 变量看 {}
        // }
        // System.out.print(i);
        // System.out.print(i);
        // 死循环
        // for(;;){

        // }

        // 一类问题
        // for(int i=1;i<=9;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j +"*"+i +"="+ (j*i) + "\t");
        //     }
        //     System.out.println();
        // }


        /*
            ****
            ****
            ****
            ****
            控制 行  4
            外层循环一趟 内层循环该多少趟就多少趟
         */

        // for(int i=1;i<=9;i++){
        //     for(int j=1;j<=9;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // 打印一下 1-100质数  只能被1 和 自己整除的
        // 打印一个质数
        // 1. 遍历1-100个数字
        // 2. 只能被1整除 并且 只能被只能被整除
        // 2. 转换一下问题 所有的数字都可以被1整除 到你自己那个数字之前只要有数字可以被整除 pass
        // for(int i=1;i<=100;i++){
        //     boolean flag = true;
        //     for(int j=2;j<i;j++){
        //         // 排除不对的
        //         if( i % j == 0){
        //             // 在给不是质数的做个标记
        //             flag = false;
        //             break;
        //         }
        //     }
        //     if(flag)System.out.println(i);
        // }


    }
}