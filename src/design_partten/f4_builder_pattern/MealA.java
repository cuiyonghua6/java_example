package design_partten.f4_builder_pattern;

/**
 * 第三，定义ConcreteBuilder（具体建造者）： 实现抽象接口，构建和装配各个部件。
 * 具体建造者：A套餐
 */
public class MealA extends MealBuilder{
    public void buildDrink() {
        meal.setDrink("可乐");
    }

    public void buildFood() {
        meal.setFood("薯条");
    }
}


