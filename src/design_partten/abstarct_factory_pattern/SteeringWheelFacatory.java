package design_partten.abstarct_factory_pattern;

/*
第三步：创建方向盘工厂接口，宝马方向盘工厂和奔驰方向盘工厂实现这个接口。
 */
//方向盘工厂接口
public interface SteeringWheelFacatory {
    String createSteeringWheel();
}

//宝马方向盘工厂
class BMWSteeringWheelFacatory implements SteeringWheelFacatory{
    @Override
    public String createSteeringWheel() {
        System.out.println("宝马方向盘工厂生产方向盘");
        return "宝马方向盘";
    }
}

//奔驰方向盘工厂
class MercedesSteeringWheelFacatory implements SteeringWheelFacatory{
    @Override
    public String createSteeringWheel() {
        System.out.println("奔驰方向盘工厂生产方向盘");
        return "奔驰方向盘";
    }
}


