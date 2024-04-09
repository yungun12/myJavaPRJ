package chapter5;
import java.util.Scanner;
public class CodeExam02 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int num;

        System.out.println("자연수를 입력하시오.");
        num = s.nextInt();

        if(num%15 == 0) {
            System.out.println("3과 5의 배수 둘다 만족합니다.");
        }
        else if (num%5 == 0) {
            System.out.println("5의 배수입니다.");
        }
        else if (num%3 == 0) {
            System.out.println("3의 배수입니다.");
        }
        else {
            System.out.println("해당 없습니다.");
        }

    s.close();
    }
}

