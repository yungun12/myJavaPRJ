package chapter6;
import java.util.Scanner;
public class test01_01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;

        System.out.println("자연수를 입력하세요.");
        num = s.nextInt();

        if(num%72 == 0) {
            System.out.println("8과9의 배수 둘다 만족합니다.");
        }
        else if (num%9 == 0) {
            System.out.println("9의 배수입니다.");
        }
        else if (num%8 == 0 ) {
            System.out.println("8의 배수입니다.");
        }
        else {
            System.out.println("해당 값이 없습니다.");
        }

        s.close();
    }
}
