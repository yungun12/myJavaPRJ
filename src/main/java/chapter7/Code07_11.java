package chapter7;
class Rabbit6{
    String shape;
    int xPos;
    int yPos;
    Rabbit6(String value){
        shape = value;
    }

    void setPosition(int x, int y){
        xPos = x;
        yPos = y;
    }

}
public class Code07_11{
    public static void main(String[] args){
        Rabbit6 rabbit1 = new Rabbit6("원");
        Rabbit6 rabbit2 = new Rabbit6("삼각형");
        Rabbit6 rabbit3 = new Rabbit6("토끼");

        System.out.printf("토끼1 객체의 모양은 [%s]입니다.\n", rabbit1.shape);
        System.out.printf("토끼2 객체의 모양은 [%s]입니다.\n", rabbit2.shape);
        System.out.printf("토끼3 객체의 모양은 [%s]입니다.\n", rabbit3.shape);
    }
}