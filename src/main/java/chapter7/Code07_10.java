package chapter7;
class Rabbit5 {
    String shape;
    int xPos;
    int yPos;

    Rabbit5() {
        shape = "토끼";
    }

    void setPosition(int x, int y) {
        xPos = x;
        yPos = y;
    }
}

public class Code07_10 {
    public static void main(String[] args) {
        Rabbit5 rabbit = new Rabbit5();

        System.out.printf("토끼 객체의 기본 모양은 [%s]입니다.", rabbit.shape);
    }
}
