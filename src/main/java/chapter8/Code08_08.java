package chapter8;
abstract class Rabbit {
    int xPos;
    int yPos;

    void move(int x, int y) {
        this.xPos = x;
        this.yPos = y;
    }

    abstract void sleep();
}

class HouseRabbit8 extends Rabbit {
    void sleep() {
        System.out.println("집토끼가 우리에서 잠자고 있습니다.");
    }
}

class MountainRabbit extends Rabbit {
    void sleep() {
        System.out.println("산토끼가 굴속에서 잠자고 있습니다.");
    }
}

public class Code08_08 {
    public static void main(String[] args){
        HouseRabbit8 hRabbit = new HouseRabbit8();
        MountainRabbit mRabbit = new MountainRabbit();

        hRabbit.sleep();
        mRabbit.sleep();
    }
}
