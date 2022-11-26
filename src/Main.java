public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        GearBox gearBox = new GearBox(5);
        System.out.println(gearBox.getCurrentGear());

        for (int i = 0; i < 7; i++) {
            gearBox.shiftUp();
        }

        gearBox.shiftDown();

        gearBox.switchRear();
        gearBox.switchNeutral();
        gearBox.switchRear();

    }

}