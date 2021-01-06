package design_partten.f4_builder_pattern;

/**
 * 第一，定义Product（产品角色）： 一个具体的产品对象。
 * 一个具体的产品对象，实体
 */
public class Meal {
    private String food;
    private String drink;

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }
}


