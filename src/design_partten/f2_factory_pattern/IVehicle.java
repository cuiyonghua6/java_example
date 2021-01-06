package design_partten.f2_factory_pattern;

/**
 * 交通工具
 */
interface IVehicle {
    void run();
}

//汽车
class Car implements IVehicle{
    @Override
    public void run() {
        System.out.println("开汽车去。。。");
    }
}

//自行车
class Bicycle implements IVehicle{
    @Override
    public void run() {
        System.out.println("骑自行车去。。。");
    }
}

