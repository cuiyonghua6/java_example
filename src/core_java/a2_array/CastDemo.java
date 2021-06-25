package core_java.a2_array;

public class CastDemo {
    public static void main(String[] args) {
        short s = 32767;       // 二进制：0111 1111 1111 1111
        int i = 65536 + 97;   // 二进制的低16位对应十进制数97
        byte b = 64;
        double d = 123.456787654321; // 小数位较多
        float f = 456.78f;

        System.out.println("1：short → byte：" + s + " → " + (byte) s);
        System.out.println("2：int → char：" + i + " → " + (char) i);
        System.out.println("3：byte → long：" + b + " → " + (long) b);
        System.out.println("4：int → float：" + i + " → " + (float) i);
        System.out.println("5：double → float：" + d + " → " + (float) d);
        System.out.println("6：float → double：" + f + " → " + (double) f);
        System.out.println("7：float → int：" + f + " → " + (int) f);

        System.out.println("我是第一行\n我是第二行\r我才是第二行");
        System.out.println("学号\t姓名\t专业");
        System.out.println("1\t李晓明\t计算机");
        System.out.println("102\tTom\t英语");
        System.out.println("Java中的双引号字符要被转义成\\\"");
        System.out.println("\'\\u6211\'对应着\'\u6211\'");
        System.out.println("测试A\b\b");
        System.out.println("测试B\b\bABC");
    }
}
