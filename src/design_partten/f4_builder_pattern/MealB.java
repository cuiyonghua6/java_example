package design_partten.f4_builder_pattern;

/**
 * 具体建造者：B套餐
 */
public class MealB extends MealBuilder{
    public void buildDrink() {
        meal.setDrink("柠檬果汁");
    }

    public void buildFood() {
        meal.setFood("鸡翅");
    }
}


