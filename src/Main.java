public class Main {
    public static void main(String[] args) {

        System.out.println("Hello the chilly world of driverless cars!\n");

        var myCar = new Car(
                CarType.SUV,
                new Engine(EngineType.DIESEL, 3.5, 156),
                new GearBox(GearBoxType.MANUAL, 5),
                2300
        );

        System.out.println("Тип автомобиля: " + myCar.getCarType());
        System.out.println("Масса автомобиля: " + myCar.getWeight());
        System.out.println("Тип двигателя: " + myCar.engine.getEngineType());
        System.out.println("Объём двигателя: " + myCar.engine.getDisplacement());
        System.out.println("Мощность двигателя: " + myCar.engine.getPower());
        System.out.println("Тип коробки передач: " + myCar.gearBox.type + " " + myCar.gearBox.maxGear);

    }

}