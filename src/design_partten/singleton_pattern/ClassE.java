package design_partten.singleton_pattern;

/**
 * 使用双重校验锁来实现单例模式
 * @author cui_yonghua  https://blog.csdn.net/cui_yonghua/article/details/90512943
 */
public class ClassE {
    //1.私有化构造方法，使得在类的外部不能调用此方法，限制产生多个对象
    private ClassE(){ }
    //2.在类的内部创建一个类的实例
    private volatile static ClassE instance; //volatile作用：保证多线程可以正确处理instance
    //3.对外部提供调用方法：将创建的对象返回，只能通过类来调用
    public static ClassE  getInstance(){
        if(instance == null){ //检查实例，如果为空，就进入同步代码块
            synchronized (ClassE.class){
                if(instance == null){ //再检查一次，仍未空才创建实例
                    instance = new ClassE();
                }
            }
        }
        return instance;
    }

    //测试
    public static void main(String[] args) {
        ClassE a = ClassE.getInstance();
        ClassE b = ClassE.getInstance();
        System.out.println(a==b);
    }
}
