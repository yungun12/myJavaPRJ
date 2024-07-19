package chapter3;

import sample.Turtle;

import java.util.Scanner;

public class Ex03_02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Turtle turtle = new Turtle();
        int angle, distance;

        turtle.width(10);
        turtle.penColor("blue");

        while(true) {
            System.out.print("거북이의 회전 각도 : ");
            angle = s.nextInt();    // 거북이의 회전 각도 입력
            System.out.print("거북이의 이동 거리 : ");
            distance = s.nextInt(); // 거북이의 선 길이 입력

            turtle.right(angle);        // 거북이를 오른쪽으로 회전시킴
            turtle.forward(distance);   //  거북이를 거리만큼 이동함
        }
    }
}
