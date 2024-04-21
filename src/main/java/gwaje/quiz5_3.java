package gwaje;
import java.util.Scanner;
public class quiz5_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();

        int hap = 0;

        for(int i=a+1; i<=b; i+=2) {
            hap = hap + i;
        }
        System.out.println(hap);

        s.close();
    }
}