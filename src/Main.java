import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello the chilly world of driverless cars!");

        System.out.println(Arrays.toString(GearBoxType.values()));

        GearBoxType type = GearBoxType.valueOf("ROBOT");

        GearBox gearBox = new GearBox(type, 5);
        System.out.println(gearBox.getCurrentGear());
        System.out.println(gearBox.type);

        for (int i = 0; i < 7; i++) {
            gearBox.shiftUp();
        }

        gearBox.shiftDown();

        gearBox.switchRear();
        gearBox.switchNeutral();
        gearBox.switchRear();

    }

}