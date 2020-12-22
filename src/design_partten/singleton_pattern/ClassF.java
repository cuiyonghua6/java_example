package design_partten.singleton_pattern;

/**
 * 使用ThreadLocal实现单例模式
 * @author cui_yonghua  https://blog.csdn.net/cui_yonghua/article/details/90512943
 */
public class ClassF {
    //1.私有化构造方法，使得在类的外部不能调用此方法，限制产生多个对象
    private ClassF(){ }
    //2.在类的内部创建一个类的实例
    private static final ThreadLocal<ClassF> tls = new ThreadLocal<ClassF>(){
        @Override
        protected ClassF initialValue(){
            return new ClassF();
        }
    };
    //3.对外部提供调用方法：将创建的对象返回，只能通过类来调用
    public static ClassF  getInstance(){
        return tls.get();
    }

    //测试
    public static void main(String[] args) {
        ClassF a = ClassF.getInstance();
        ClassF b = ClassF.getInstance();
        System.out.println(a==b);
    }
}

