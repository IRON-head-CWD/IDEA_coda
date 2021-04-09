package Tes05;

public class Test {
    public static void main(String[] args) {
       // Animal d2=new Dog();
       // d2 .eat();
        function(new Dog());
       // function(new Animal());
    }

    private static void function(Animal a) {
        a.eat();
        Dog c=(Dog) a;
        c.maimeng();
    }
}
