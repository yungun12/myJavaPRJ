public class triangle {

    public static void main(String[] args) {

        for (int i = 1; i < 5; i++) {
            if (i < 5) {

                for (int j = 0; j < i; j++) {
                        System.out.print("*");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            if (i < 4) {

                for (int j = 3; j > i; j--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
