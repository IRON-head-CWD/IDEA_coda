package com.itheima03;



public class Test08 {
    public static void main(String[] args) {
        Animal02 aaa=new Cat02();
        giveGirlFriendPet(aaa);
        giveGirlFriendPet(new Animal02(){
            @Override
            public void eat() {
                System.out.println("主公白瓷啊");
            }
        });
    }

    private static void giveGirlFriendPet(Animal02 ani) {
        ani.eat();
    }
}
