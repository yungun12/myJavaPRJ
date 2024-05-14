package chapter8;
    class Rabbit7 {
        String shape;
        int xpos;
        int ypos;

    void move(int x, int y) {
        this.xpos = x;
        this.ypos = y;
    }
}

    class HouseRabbit7 extends Rabbit6 {
    String owner;
    void eatFood() {
        System.out.println("집토끼가 사료를 먹습니다.");
    }
}

    class MountainRabbit7 extends Rabbit6 {
    String mountain;
    void eatWildglass() {
        System.out.println("산토끼가 풀을 먹습니다.");
    }
}
public class Code08_03 {
        public static void main(String[] args) {
            HouseRabbit7 hRabbit7 = new HouseRabbit7();
            MountainRabbit7 mRabbit7 = new MountainRabbit7();

            hRabbit7.shape = "삼각형";
            hRabbit7.owner = "난생이";
            hRabbit7.move(100, 100);
            hRabbit7.eatFood();

            mRabbit7.shape = "네모";
            mRabbit7.mountain = "설악산";
            mRabbit7.move(200, 200);
            mRabbit7.eatWildglass();
        }
}
