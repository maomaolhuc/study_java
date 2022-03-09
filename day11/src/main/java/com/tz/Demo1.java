package com.tz;

public class Demo1{
    public static void main(String[] args) {
        /*
            异常是java中处理问题的 相当于现实生活中发生的"不正常"的事情
            异常是一个描述问题的类
            问题其实可以被描述的
                问题发生在哪里
                问题发生的内容
            york今天在学校门口吃鸡公煲 点了一份大的吃到了一直绿色大头苍蝇
            数组越界
            空指针
            类型转换
            错误参数

            编译时期: 错误  有问题的需要修改代码
            运行时期: 异常  是可以被解决的
                抛出 捕获
            运行时期的异常

            抛出异常 程序就终止了 异常后边的语句都不会去执行了
            为啥抛出异常程序就不进行了? 异常后边的代码用到前边的内容 所以就停止
            return 是程序正常结束的过程

            异常解决方式
            抛出的问题 是需要被解决的  抛出问题 捕获问题
         */


        method();
        System.out.println("hahah");

    }

    public static void method(){
        int a = 1;
        int b = 0;
        if(b != 0){
            int c = a/b;
        }else{
            //
            throw new MyException("除数不能是0");
            // System.out.println("除数不能为0");
        }
    }
}

// 执行方法期间抛出但未被捕获的 RuntimeException 的任何子类都无需在 throws 子句中进行声明
class MyException extends RuntimeException {
    public MyException(){

    }

    public MyException(String s){
        super(s);
    }
}