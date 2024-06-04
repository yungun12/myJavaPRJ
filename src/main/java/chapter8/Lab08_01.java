package chapter8;
import java.util.Scanner;

class superCar {
    int speed =0;

    void upSpeed(int value) {
        this.speed += value;
    }
}

class SchoolBus extends superCar {
    void upSpeed(int value) {
        this.speed += value;
        if (this.speed > 60)
            this.speed = 60;
    }
}

class SportsCar extends superCar {

}

public class Lab08_01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int axel;   //가속할 속도

        SchoolBus bus = new SchoolBus();
        SportsCar car = new SportsCar();

        while(true) {
            System.out.print("가속할 속도 ==> ");
            axel = s.nextInt();

            bus.upSpeed(axel);
            car.upSpeed(axel);

            System.out.printf("** 스쿨버스의 현재 속도: %d\n", bus.speed);
            System.out.printf("** 스포츠가의 현재 속도: %d\n", car.speed);
        }
    }
}
