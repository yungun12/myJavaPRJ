package chapter8;

    class Rabbit6 {
        String shape;
        int xpos;
        int ypos;

        void move(int x, int y) {
            this.xpos = x;
            this.ypos = y;
        }
    }

    class HouseRabbit6 extends Rabbit6 {
        String owner;
        void eatFood() {
            System.out.println("집토끼가 사료를 먹습니다.");
        }
    }

    class MountainRabbit6 extends Rabbit6 {
        String mountain;
        void eatWildglass() {
            System.out.println("산토끼가 풀을 먹습니다.");
        }
    }

public class Code08_02 {
        public static void main(String[] args) {

        }
}
