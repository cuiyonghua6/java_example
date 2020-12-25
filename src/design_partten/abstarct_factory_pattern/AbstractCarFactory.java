package design_partten.abstarct_factory_pattern;

//抽象汽车工厂接口
public interface AbstractCarFactory {
    void installWheel();
    void installSteeringWheel();
}

//宝马工厂
class BMWCarFactory implements AbstractCarFactory {

    @Override
    public void installWheel() {
        BMWWheelFactory bmwWheelFactory = new BMWWheelFactory();
        String wheel = bmwWheelFactory.createWheel();
        System.out.println("安装轮胎:"+wheel);
    }

    @Override
    public void installSteeringWheel() {
        BMWSteeringWheelFacatory bmwSteeringWheelFacatory = new BMWSteeringWheelFacatory();
        String steeringWheel = bmwSteeringWheelFacatory.createSteeringWheel();
        System.out.println("安装方向盘：" + steeringWheel);
    }
}

//奔驰工厂
class MercedesCarFacatory implements AbstractCarFactory {
    @Override
    public void installWheel() {
        MercedesWheelFactory mercedesWheelFactory = new MercedesWheelFactory();
        String wheel = mercedesWheelFactory.createWheel();
        System.out.println("安装轮胎:"+wheel);
    }
    @Override
    public void installSteeringWheel() {
        MercedesSteeringWheelFacatory mercedesSteeringWheelFacatory = new MercedesSteeringWheelFacatory();
        String steeringWheel = mercedesSteeringWheelFacatory.createSteeringWheel();
        System.out.println("安装方向盘：" + steeringWheel);
    }
}

