package chapter8;
interface Rabbit8 {
    abstract void sleep();
}

class HouseRabbit8 implements Rabbit8 {
    public void sleep() {
        System.out.println("집토끼가 우리에서 잠자고 있습니다.");
    }
}

class MountainRabbit8 implements Rabbit8 {
    public void sleep() {
        System.out.println("산토끼가 굴속에서 잠자고 있습니다.");
    }
}

public class Code08_09 {
    public static void main(String[] args) {
        HouseRabbit8 hRabbit = new HouseRabbit8();
        MountainRabbit8 mRabbit = new MountainRabbit8();

        hRabbit.sleep();
        mRabbit.sleep();
    }
}
