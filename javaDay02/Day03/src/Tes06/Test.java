package Tes06;

public class Test {
    public static void main(String[] args) {
    }

    public static void function(Fu a) {
        a.eat();
        if (a instanceof horse) {
            horse make = (horse) a;
            make.run();
        }
        if (a instanceof Deer) {
            Deer make = (Deer) a;
            make.taio();
        }
    }
}
