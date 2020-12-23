package design_partten.factory_pattern;

/*
简单工厂模式拓展性不好，优秀的java代码是符合“开放-封闭”原则的，
也就是说对扩展开发，对修改关闭，如果想骑电动车去上班，在这里就要增加if-else判断。
对于这个问题，我们的工厂方法模式就可以解决这个问题。
 */
public class TestSimpleFactory {
    public static void main(String[] args) {
        XiaoMing xiaoMing = new XiaoMing();
        // 小明骑自行车去学校
        IVehicle motorcycle = GarageFactory.getVehicle("bicycle");
        xiaoMing.goToSchool(motorcycle);
        // 小明开汽车去旅游
        IVehicle car = GarageFactory.getVehicle("car");
        xiaoMing.travel(car);

    }
}

class XiaoMing{
    public void goToSchool(IVehicle vehicle){
        System.out.println("小明去学校：");
        vehicle.run();
    }
    public void travel(IVehicle vehicle){
        System.out.println("小明去旅游：");
        vehicle.run();
    }
}

