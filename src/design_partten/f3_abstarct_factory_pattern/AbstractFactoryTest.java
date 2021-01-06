package design_partten.f3_abstarct_factory_pattern;

/**
 * 第四步：测试类
 */
//测试
public class AbstractFactoryTest {
    public static void main(String[] args) {
        // 宝马员工安装轮胎和方向盘
        BMWCarFactory bmwCarFactory = new BMWCarFactory();
        bmwCarFactory.installWheel();
        bmwCarFactory.installSteeringWheel();

        // 奔驰员工安装轮胎和方向盘
        MercedesCarFacatory mercedesCarFacatory = new MercedesCarFacatory();
        mercedesCarFacatory.installWheel();
        mercedesCarFacatory.installSteeringWheel();

    }
}


