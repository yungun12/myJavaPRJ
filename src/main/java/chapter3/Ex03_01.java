package chapter3;

import sample.Turtle;

public class Ex03_01 {
    public static void main(String[] args) {
        Turtle turtle = new Turtle();

        turtle.width(5);
        turtle.penColor("red");

        turtle.right(45);

        turtle.up();
        turtle.forward(20);
        turtle.down();
        turtle.forward(20);

        // 10~13행을 4회 반복
    }
}
