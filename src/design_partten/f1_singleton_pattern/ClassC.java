package design_partten.f1_singleton_pattern;

/**
 * 使用静态内部类方式实现单例模式
 * @author cui_yonghua  https://blog.csdn.net/cui_yonghua/article/details/90512943
 */
public class ClassC {
    //1.私有化构造方法，使得在类的外部不能调用此方法，限制产生多个对象
    private ClassC(){ }
    //2.在类的内部创建一个类的实例
    private static class Holder{
        private static ClassC instance = new ClassC();
    }
    //3.对外部提供调用方法：将创建的对象返回，只能通过类来调用
    public static ClassC  getInstance(){
        return Holder.instance;
    }

    //测试
    public static void main(String[] args) {
        ClassC a = ClassC.getInstance();
        ClassC b = ClassC.getInstance();
        System.out.println(a==b);
    }
}

