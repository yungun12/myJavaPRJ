package chapter8;
    class rabbit {
        String shape;
        int xpos;
        int ypos;
        static int count;

        rabbit() {
            count++;
        }
    }

public class Code08_01 {
        public static void main(String[] args) {
            System.out.println("객체 생성 전의 총 토끼 수 ==>" + rabbit.count);

            rabbit rabbit = new rabbit();
            System.out.println("토끼 객체1 생성 후의 총 토끼 수 ==>" + rabbit.count);

            rabbit rabbit2 = new rabbit();
            System.out.println("토끼 객체2 생성 후의 총 토끼 수 ==>" + rabbit.count);
        }
}
