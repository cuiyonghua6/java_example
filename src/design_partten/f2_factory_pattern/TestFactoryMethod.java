package design_partten.f2_factory_pattern;

/*
工厂方法模式可以说在你能想到的开源框架源码中必定会使用的一个设计模式，
因为开源框架很重要一点就是要有扩展性，而工厂方法模式恰恰具有可扩展性。
 */
public class TestFactoryMethod {
    public static void main(String[] args) {

        XiaoMing xiaoMing = new XiaoMing();
        //小明骑自行车去学校
        BicycleGarage bicycleGarage = new BicycleGarage();
        IVehicle bicycle = bicycleGarage.getVehicle();
        xiaoMing.goToSchool(bicycle);

        //小明开汽车去旅游
        CarGarage carGarage = new CarGarage();
        IVehicle car = carGarage.getVehicle();
        xiaoMing.travel(car);
    }
}

