package gwaje;
import java.util.Scanner;
public class quiz5_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;

        System.out.println("자연수를 입력하세요:");
        num = s.nextInt();

        if(num%21 == 0) {
            System.out.println("3과 7의 배수입니다.");
        }
        else if(num%7 == 0){
            System.out.println("7의 배수입니다.");
        }
        else if (num%3 == 0){
            System.out.println("3의 배수 입니다");
        }
        else {
            System.out.println("잘못된 선택입니다.");
        }

        s.close();
    }
}