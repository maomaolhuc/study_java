public class Demo2{
    public static void main(String[] args) throws MyException {
        /*
            声明的目的是为了 给出解决方案
            RuntimeException 不给就是默认打印错误提示
            加入你写了一个程序 里边有一个方法 这个方法执行可能会有问题 所以写这个方法的时候
            声明出来了这个问题(调用的人看到了有问题 会去选择解决)
            如果说一直在throws最后就交给jvm去抛出这个问题了
            抛是在你确实解决不了 或者 这个问题属于其他的 需要别的地方去解决的

            throw  用在函数中  抛出的是异常对象
            throws 用在函数定义上 抛出的是异常类

            异常:
                运行时期发生的问题异常(针对性的解决方案的) 也可以是错误(修改代码了)
         */
        // a();

        try{
            throw new RuntimeException("123");
        }  finally {
            System.out.println("我必然会被执行");
        }
       // System.out.println("over");

    }

    public static void a() throws MyException {
        method();
    }

    // method 运行有风险  throws声明风险
    public static void method() throws MyException {
        if(true){
            throw new MyException("你们接着甩锅 就是不解决我的问题");
        };
    }
}




class MyException extends Exception{
    public MyException(){

    }

    public MyException(String s) {
        super(s);
    }
}