package design_partten.f2_factory_pattern;

public interface VehicleGarage {
    IVehicle getVehicle();
}

//汽车车库
class CarGarage implements VehicleGarage{
    @Override
    public IVehicle getVehicle() {
        return new Car();
    }
}

//自行车车库
class BicycleGarage implements VehicleGarage{
    @Override
    public IVehicle getVehicle() {
        return new Bicycle();
    }
}


