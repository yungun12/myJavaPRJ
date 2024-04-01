package chapter5;
import java.util.Scanner;

public class Code05_07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int score;

        System.out.print("점수 입력 ==> ");
        score = s.nextInt();

        if (score >= 90) {
            System.out.printf("A");
    } else {
        if (score >= 80) {
            System.out.printf("B");
        } else {
            if (score >= 70) {
                System.out.printf("C");
            } else {
                if (score >= 60) {
                    System.out.printf("D");
                } else {
                    System.out.printf("F");

                   System.out.println(" 학점입니다.");
                }
                }
            }
            }
        }
    }
