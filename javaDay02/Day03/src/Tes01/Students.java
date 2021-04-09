package Tes01;

public class Students {
    static {
        System.out.println("静态");
    }

    {
        System.out.println("代码块");
    }

    public Students() {
        System.out.println("构造方法");
    }
}
