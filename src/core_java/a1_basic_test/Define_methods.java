package core_java.a1_basic_test;

//定义了一个类a
public class Define_methods {
    //定义成员变量
    int i = 2;
    char c = 3;

    //定义方法b
    public void abc() {
        System.out.println("b");
        System.out.println(i+c);
    }

    //Java程序的主入口方法
    public static void main(String[] args) {
        System.out.println("main");

        Define_methods dm = new Define_methods();
        dm.abc();
    }
}