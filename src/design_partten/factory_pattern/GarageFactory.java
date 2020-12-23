package design_partten.factory_pattern;

//车库
public class GarageFactory {
    public static IVehicle getVehicle(String type) {
        if ("car".equals(type)) {
            return new Car();
        } else if ("bicycle".equals(type)) {
            return new Bicycle();
        }
        throw new IllegalArgumentException("请输入车类型");
    }
}
