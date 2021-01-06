package design_partten.f1_singleton_pattern;

import java.util.concurrent.atomic.AtomicReference;

/**
 * 使用CAS锁来实现单例模式
 * @author cui_yonghua  https://blog.csdn.net/cui_yonghua/article/details/90512943
 */
public class ClassG {
    //1.私有化构造方法，使得在类的外部不能调用此方法，限制产生多个对象
    private ClassG(){ }
    //2.在类的内部创建一个类的实例
    private static final AtomicReference<ClassG> instance = new AtomicReference<ClassG>();
    //3.对外部提供调用方法：将创建的对象返回，只能通过类来调用
    public static final ClassG getInstance(){
        for(;;){
            ClassG current = instance.get();
            if(current != null){
                return current;
            }
            current = new ClassG();
            if(instance.compareAndSet(null,current)){
                return current;
            }
        }
    }

    //测试
    public static void main(String[] args) {
        ClassG a = ClassG.getInstance();
        ClassG b = ClassG.getInstance();
        System.out.println(a==b);
    }
}


