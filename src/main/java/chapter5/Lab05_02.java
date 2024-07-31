package chapter5;

import java.util.Scanner;

public class Lab05_02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String myHand, comHand;

        System.out.print("나의 가위/바위/보 ==> ");
        myHand = s.next();

        String[] hands = {"가위", "바위", "보"};
        int rnd = (int) (Math.random() * hands.length);
        comHand = hands[rnd];
        System.out.println("컴퓨터의 가위/바위/보 ==> " + comHand);

        if (myHand.equals("가위")) {
            if (comHand.equals("가위"))
                System.out.println("비겼습니다. ㅡ.ㅡ");
            else if (comHand.equals("바위"))
                System.out.println("졋습니다. ㅠ.ㅠ");
            else if (comHand.equals("보") )
                System.out.println("이겼습니다. ^.^");
        }
        else if (myHand.equals("바위")) {
            if (comHand.equals("가위"))
                System.out.println("이겼습니다. ^.^");
            else if (comHand.equals("바위"))
                System.out.println("비겼습니다. ㅡ.ㅡ");
            else if (comHand.equals("보"))
                System.out.println("졌습니다. ㅠ.ㅠ");
        }
        else if (myHand.equals("보")) {
            if (comHand.equals("가위"))
                System.out.println("졌습니다. ㅠ.ㅠ");
            else if (comHand.equals("바위"))
                System.out.println("이겼습니다. ^.^");
            else if (comHand.equals("보"))
                System.out.println("비겼습니다. ㅡ.ㅡ");
        }
        else {
            System.out.println("가위/바위/보 중 하나를 내세요.");
        }

        s.close();
    }
}
