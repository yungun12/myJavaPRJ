package chapter7;

class Rabbit3 {
    String shape;
    int xPos;
    int yPos;

    void setPosition(int x, int y) {
        xPos = x;
        yPos = y;
    }
}

    public class Code07_09 {
        public static void main(String[] args) {
            Rabbit3 rabbit1 = new Rabbit3();
            Rabbit3 rabbit2 = new Rabbit3();
            Rabbit3 rabbit3 = new Rabbit3();

            rabbit1.shape = "원";
            rabbit2.shape = "삼각형";
            rabbit3.shape = "토끼";

            rabbit1.setPosition(100, 100);
            rabbit2.setPosition(-100, 100);
            rabbit3.setPosition(0, -100);

        }
}
