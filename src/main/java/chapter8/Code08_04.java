package chapter8;

    class Rabbit8 {
        Rabbit8 () {
            System.out.println("1. 슈퍼 클래스(토끼)의 생성자가 호줄됩니다.");
        }
    }

    class HouseRabbit1 extends Rabbit8 {
        HouseRabbit1 () {
            System.out.println("2. 서브 클래스(집토끼)의 생성자가 호줄됩니다.");
        }
    }

public class Code08_04 {
        public static void main(String[] args) {
            HouseRabbit hRabbit = new HouseRabbit();
        }
}
