package design_partten.f1_singleton_pattern;

/**
 * 使用枚举方法实现单例模式
 * @author cui_yonghua  https://blog.csdn.net/cui_yonghua/article/details/90512943
 */
public enum ClassD {
    //定义一个枚举的元素，它就代表了Singleton的一个实例。
    INSTANCE;
    //对外部提供调用方法：将创建的对象返回，只能通过类来调用
    public void otherMethod(){
        //功能处理
    }

    //测试
    public static void main(String[] args) {
        ClassD a = ClassD.INSTANCE;
        ClassD b = ClassD.INSTANCE;
        System.out.println(a==b);
    }
}
