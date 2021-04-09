package Tes03;

public interface JieKou {
    public static final String ADDRESS="WWW.itheima";
    public abstract void methodAbstract();
    public default void methodDefault(){
        System.out.println("jiekou默认");

    }

    public static void methodStatic() {
        System.out.println("静态方法");
    }
    private void methodPrivate(){
        System.out.println("接口私有方法");
    }
}
