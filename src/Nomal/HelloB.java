package Nomal;

/**
 * Description TODO
 * Author Cloudr
 * Date 2020/4/5 22:36
 **/
public class HelloB extends HelloA {
    public HelloB() {
        System.out.println("子类构造方法");

    }

    {
        System.out.println("I’m B class");
    }

    static {
        System.out.println("static B");
    }

    public static void main(String[] args) {
        new HelloB();
    }
}
