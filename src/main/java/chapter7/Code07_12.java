package chapter7;
    class Rabbit00 {
        private String shape;

        private int xPos;

        private int yPos;

        void setPosition(int xPos, int yPos) {
            this.xPos = xPos;
            this.yPos = yPos;
        }


    }

    public class Code07_12 {
        public static void main(String[] args) {
            Rabbit00 rabbit00 = new Rabbit00();

            rabbit00.setPosition(100, 200);
        }
}
