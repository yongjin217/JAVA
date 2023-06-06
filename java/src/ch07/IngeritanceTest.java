package ch07;

class MyPoint {
    int x;
    int y;
}

//class Circle extends MyPoint { //상속
//    int r;
//}

class Circle {  //포함
    MyPoint p = new MyPoint();
    int r;
}
public class IngeritanceTest {
    public static void main(String[] args) {
        Circle c = new Circle();
//        c.x = 1;  //상속
//        c.y = 2;  //상속
        c.p.x = 1;  //포함
        c.p.y = 2;  //포함
        c.r = 3;
//        System.out.println("c.x="+c.x);  //상속
//        System.out.println("c.y="+c.y);  //상속
        System.out.println("c.x="+c.p.x);  //포함
        System.out.println("c.y="+c.p.y);  //포함
        System.out.println("c.r="+c.r);
    }
}
