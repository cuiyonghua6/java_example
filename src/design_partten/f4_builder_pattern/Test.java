package design_partten.f4_builder_pattern;

/**
 * 第五，定义测试类：
 * 测试类
 */
public class Test {
    public static void main(String[] args) {

        MealA a = new MealA();//创建套餐A对象
        KFCServer waitera = new KFCServer(a);//准备套餐A的服务员
        Meal mealA = waitera.construct();//获得套餐A
        System.out.print("套餐A的组成部分:");
        System.out.println("食物："+mealA.getFood()+"；   "+"饮品："+mealA.getDrink());

        MealB b = new MealB();
        KFCServer waiterb = new KFCServer(b);
        Meal mealB = waiterb.construct();
        System.out.print("套餐B的组成部分:");
        System.out.println("食物："+mealB.getFood()+"；   "+"饮品："+mealB.getDrink());
    }
}


