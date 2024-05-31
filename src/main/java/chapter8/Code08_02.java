package chapter8;

class Rabbit1 {
    String shape;
    int xPos;
    int yPos;

    void move(int x, int y) {
        this.xPos = x;
        this.yPos = y;
    }
}

class HouseRabbit1 extends Rabbit1 {
    String owner;
    void eatFeed() {
        System.out.println("집토끼가 사료를 먹습니다.");
    }
}

class MountainRabbit1 extends Rabbit1 {
    String mountain;
    void eatWildglass() {
        System.out.println("산토끼가 풀을 먹습니다.");
    }
}

public class Code08_02 {
    public static void main(String[] args) {


    }
}