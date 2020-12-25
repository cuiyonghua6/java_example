package design_partten.abstarct_factory_pattern;

//轮胎工厂接口
public interface WheelFactory {
    String createWheel();
}

//宝马轮胎工厂
class BMWWheelFactory implements WheelFactory {
    @Override
    public String createWheel() {
        System.out.println("宝马轮胎工厂生产轮胎");
        return "宝马轮胎";
    }
}

//奔驰轮胎工厂
class MercedesWheelFactory implements WheelFactory {
    @Override
    public String createWheel() {
        System.out.println("奔驰轮胎工厂生产轮胎");
        return "奔驰轮胎";
    }
}

