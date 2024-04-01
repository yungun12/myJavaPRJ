package chapter5;

import java.util.Scanner;

public class Code05_01 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int num = 99;

        if (num < 100) {
            System.out.print("100 보다 ");
            System.out.print("작습니다.");
        }

        System.out.println("난 조선절과 상관없이 무조건 실행된다.");
    }
}
