package chapter3;

public class Lab03_03 {
    public static void main(String[] args) {
        int Java = 3, mobile = 2, excel = 1;
        double A = 4.5, A0 = 4.0, B = 3.5;

        double avg;
        avg = ((Java*B) + (mobile*A0) + (excel*A)) / (Java + mobile + excel);
        avg = Math.round(avg*100.0) / 100.0;

        System.out.println("평균 학점 : " + avg);
    }
}
