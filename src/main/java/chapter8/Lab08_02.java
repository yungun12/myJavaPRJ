package chapter8;

import sample.Turtle;

    class SuperTurtle extends Turtle {
        public void speed(int value) {
            super.speed(value / 2);
        }

        public void right(int value) {
            super.right(value * 2);
        }

        public void forward(int value) {
            super.forward(value);
        }

        public long shapeSize(int value1, int value2) {
            super.shapeSize(value1 * 2, value2 * 2);
            return 0;
        }
    }
public class Lab08_02 {
   public static void main(String[] args) {
        Turtle turtle = new Turtle();
        SuperTurtle sTurtle = new SuperTurtle();

        int speed, size, angle, distance;

        turtle.setPosition(500, 500);
        turtle.fillColor("blue");
        turtle.penColor("blue");
        sTurtle.fillColor("red");
        sTurtle.penColor("red");

        while(true) {
            speed = (int) (Math.random()*1000);
            angle = (int) (Math.random()*360);
            distance = (int) (Math.random() * 50 + 10);
            size = (int) (Math.random() * 100);

            turtle.speed(speed);
            sTurtle.speed(speed);

            turtle.shapeSize(size, size);
            sTurtle.shapeSize(size, size);

            turtle.right(angle);
            turtle.right(angle);

            turtle.forward(distance);
            sTurtle.forward(distance);
        }
   }
}
