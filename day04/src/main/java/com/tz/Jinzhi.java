package com.tz;

public class Jinzhi{
    public static void main(String[] args) {
        /*
            10 转 2进制
            10 转 8进制
            10 转 16进制

            留个作业
                1. switch 写一个判断 输出2010-2018 2月份 月多少天的?
                2. 请同学们帮解决这个问题
         */

        int num = 95;
        // num 转成 16进制
        // 1. 创建数组 为了保存 截取出来的 数字
        char[] arr = new char[8];
        // 2. 循环去截取  既然是10 -- 16 四位有效位的去获取

        for(int i=0;i<8;i++){
            // 3. 每次循环截取4位
            int sub = num & 15;  // 数字  97 a-f   0 --- 48
            if(sub > 9){
                arr[i] = (char)(sub + 97 - 10);
            }else{
                arr[i] =(char)(sub + '0');
            // 4. 右移4位
            }
            num = num >> 4;
        }

        // 1. 数组是反的 ? 咋办
        // 解决方式1 写入新的数组
        // 解决方式2 能不能在当前数组中调换
        // for (char hex : arr) {
        //     System.out.print(hex);
        // }

        for(int start = 0, end = arr.length - 1;start < end ;start++, end--){
            // arr[start] = arr[start] ^ arr[end];
            // arr[end] = arr[start] ^ arr[end];
            // arr[start] = arr[start] ^ arr[end];
            char temp;
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            // start++;
            // end--;
        }

        // 2. 第二个问题 发现有很多的0  这个0 是不是不是必须的
        // int index = 0;
        // for (int i=0;i<arr.length;i++) {
        //     if(arr[i] > 48){
        //         index = i;
        //         break;
        //     }
        // }


        // for (int i=index;i<arr.length;i++) {
        //     System.out.print(arr[i]);
        // }


        // for(int year=2010;year<=2018;i++){
            // if()  判断是不是闰年

        // }
    }

    // 权限 静态 返回值类型 名字(类型 参数, 类型 参数)
    public static boolean yearRun(int year){
        return (year % 4 == 0 && year % 100 !=0) || year % 400 == 0;
    }
    public static int getDay(int year, int month){

    }
}