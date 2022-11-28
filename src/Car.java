public class Car {
    final CarType carType;
    final Engine engine;
    final GearBox gearBox;
    final int weight;

    public Car(CarType carType, Engine engine, GearBox gearBox, int weight) {
        this.carType = carType;
        this.engine = engine;
        this.gearBox = gearBox;
        this.weight = weight;
    }

    public CarType getCarType() {
        return carType;
    }

    public Engine getEngine() {
        return engine;
    }

    public GearBox getGearBox() {
        return gearBox;
    }

    public int getWeight() {
        return weight;
    }
}
