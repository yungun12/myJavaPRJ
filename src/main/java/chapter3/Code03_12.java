package chapter3;

public class Code03_12 {
    public static void main(String[] args) {
        int num = 99;

        System.out.println( (num > 100) && (num < 200) );
        System.out.println( (num > 99) || (num == 100) );
        System.out.println( !(num == 100) );
    }
}
