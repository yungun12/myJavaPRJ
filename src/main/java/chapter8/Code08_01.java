package chapter8;
    class Rabbit {
        String shape;
        int xpos;
        int ypos;
        static int count;

        Rabbit() {
            count++;
        }
    }

public class Code08_01 {
        public static void main(String[] args) {
            System.out.println("객체 생성 전의 총 토끼 수 ==>" + Rabbit.count);

            Rabbit rabbit = new Rabbit();
            System.out.println("토끼 객체1 생성 후의 총 토끼 수 ==>" + Rabbit.count);

            Rabbit rabbit2 = new Rabbit();
            System.out.println("토끼 객체2 생성 후의 총 토끼 수 ==>" + Rabbit.count);
        }
}
