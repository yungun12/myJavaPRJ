package chapter9;

import java.util.Arrays;
import java.util.Collections;

public class Code09_09 {
    public static void main(String[] args) {
        String[] strAry = {"해린", "혜인", "하니", "민지", "다니엘"};
        System.out.println("원본 : " + Arrays.toString(strAry));

        Collections.reverse(Arrays.asList(strAry));

        System.out.println("역순 : " + Arrays.toString(strAry));
    }
}
