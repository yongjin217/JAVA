package ch06;

class Tv {
    String color;
    boolean power;
    int channel;
    void power () { power = !power; }
    void channelUp () { channel++; }
    void channelDown () { channel--; }
}
public class Ex6_1 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();
        t2 = t1;
        t1.channel = 7;
        t1.channelUp();
        System.out.println(t1.channel);
//        t1.channelDown();
        System.out.println(t2.channel);

    }
}
