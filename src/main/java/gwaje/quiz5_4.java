package gwaje;

public class quiz5_4 {
    public static void main(String[] args) {

        for (int i = 2; i <= 9 * 9; i++) {       // 반복문을 2부터 81까지 돌린다 (9 * 9 = 81, 총 81번 반복)

            int dan = (i - 2) / 9 + 2;  // 현재 단(dan)을 계산 (i - 2) / 9 + 2로 단을 구한다

            int num = (i - 2) % 9 + 1;  // 현재 단의 숫자(num)를 계산 (i - 2) % 9 + 1로 곱할 숫자를 구한다

            System.out.printf("%d x %d = %d%n", dan, num, dan * num);     // 현재 단과 숫자, 그리고 그들의 곱셈 결과를 출력

            if (num == 9) {     // num이 9일 때, 즉 한 단이 끝날 때 빈 줄을 추가하여 가독성을 높인다
                System.out.println();     // 각 단 사이에 빈 줄 추가
            }
        }
    }
}
