package Baekjoon;
import java.util.Scanner;
public class Memo03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b;

        System.out.print("");
        a = s.nextInt();
        System.out.print("");
        b = s.nextInt();

        if (b == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
        } else {
            System.out.println(a / b);

            s.close();
        }
    }
}