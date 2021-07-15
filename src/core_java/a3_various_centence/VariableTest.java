package core_java.a3_various_centence;

public class VariableTest {
    static int allClicks=0;    // 类变量
    String str="hello world";  // 实例变量
    public void method(){
        int i =0;  // 局部变量

    }

    public void pupAge(){
        int age = 0;  // age 变量需要初始化
        age = age + 7;
        System.out.println("小狗的年龄是: " + age);
    }

    public static void main(String[] args){
        VariableTest test = new VariableTest();
        test.pupAge();
    }
}
