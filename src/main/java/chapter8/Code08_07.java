package chapter8;

abstract class Rabbit6 {
    String shape;
    int xPos;
    int yPos;

    void move(int x, int y) {
        this.xPos = x;
        this.yPos = y;
    }
}

class HouseRabbit6 extends Rabbit6 {
}

class MountainRabbit6 extends Rabbit6 {
}

public class Code08_07 {
    public static void main(String[] args) {
        //  Rabbit rabbit = new Rabbit();
        HouseRabbit6 hRabbit = new HouseRabbit6();
        System.out.println("집토끼 객체 생성~~~");
        MountainRabbit6 mRabbit = new MountainRabbit6();
        System.out.println("산토끼 객체 생성~~~");
    }
}