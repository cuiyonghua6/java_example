package design_partten.f4_builder_pattern;

/**
 * 第二，定义Builder（抽象建造者）： 创建一个Product对象的各个部件指定的抽象接口。
 * 抽象建造者
 */
public abstract class MealBuilder {

    Meal meal = new Meal();

    public abstract void buildFood();

    public abstract void buildDrink();

    public Meal getMeal(){
        return meal;
    }
}


