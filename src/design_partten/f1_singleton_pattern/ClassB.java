package design_partten.f1_singleton_pattern;

/**
 * 懒汉式单例模式
 * @author cui_yonghua  https://blog.csdn.net/cui_yonghua/article/details/90512943
 */
public class ClassB {
    //1.私有化构造方法，使得在类的外部不能调用此方法，限制产生多个对象
    private ClassB(){ }
    //2.在类的内部创建一个类的实例
    private static ClassB instance ;
    //3.对外部提供调用方法：将创建的对象返回，只能通过类来调用
    public static synchronized ClassB  getInstance(){
        if(instance == null) {
            instance = new ClassB();
        }
        return instance;
    }

    //测试
    public static void main(String[] args) {
        ClassB a = ClassB.getInstance();
        ClassB b = ClassB.getInstance();
        System.out.println(a==b);
    }
}



