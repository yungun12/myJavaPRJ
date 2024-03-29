package gwaje;
public class quiz1_1 {
    public static void main(String[] args) {
        // 행의 수를 정의 합니다.
        int numRows = 4;

        // 행을 위한 바깥쪽 루프를 사용합니다.
        for (int i = 0; i < numRows; i++) {
            //빈 공간을 출력하기 위한 안쪽 루프를 사용합니다.
            for (int j = 0; j < numRows - i - 1; j++) {
                System.out.print(" ");
            }

        // 별표를 출력하기 위한 안쪽 루프를 사용합니다.
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            // 각 행마다 줄을 바꿉니다.
            System.out.println();
        }
    }
}