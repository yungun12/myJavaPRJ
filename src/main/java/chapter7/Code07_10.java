package chapter7;
    class Rabbit {
        String shape;   //토끼의 모양
        int xPos;       //x 위치
        int yPos;       // y 위치

        Rabbit() {
            shape = "토끼";
        }

        void setPosition(int x, int y) {
            xPos = x;
            yPos = y;
        }
    }


    public class Code07_10 {
        public static void main(String[] args) {
            Rabbit rabbit = new Rabbit();

            System.out.printf("토끼 객체의 기본 모양은 [%s]입니다.", rabbit.shape);
        }
}
