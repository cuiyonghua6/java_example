package design_partten.singleton_pattern;

/**
 * 饿汉式单例模式
 * @author cui_yonghua  https://blog.csdn.net/cui_yonghua/article/details/90512943
 */
public class ClassA {
    //1.私有化构造方法，使得在类的外部不能调用此方法，限制产生多个对象
    private ClassA(){ }
    //2.在类的内部创建一个类的实例
    //类初始化时，立即加载这个对象（没有延时加载的优势）。加载类时，天然的是线程安全的！
    private static final ClassA instance = new ClassA();
    //3.对外部提供调用方法：将创建的对象返回，只能通过类来调用
    //方法没有同步，调用效率高！
    public static ClassA  getInstance(){
        return instance;
    }

    //测试
    public static void main(String[] args) {
        ClassA a = ClassA.getInstance();
        ClassA b = ClassA.getInstance();
        System.out.println(a==b);
    }
}

