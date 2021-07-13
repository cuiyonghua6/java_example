package corejava.ch02;

public class CastDemo {
    public static void main(String[] args) {
        byte a;                // 定义byte类型的变量a
        int b = 298;          // 定义int类型的变量b
        a = (byte) b;
        System.out.println("b=" + b);
        System.out.println("a=" + a);
    }
}
