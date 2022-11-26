public class GearBox {
    private int gear = 0;
    public final int maxGear;
    public static final int MIN_GEAR = 1;

    public GearBox(int maxGear) {
        this.maxGear = maxGear;
    }

    public void shiftUp() {
        if (gear < maxGear) {
            gear += 1;
            System.out.print("Shifted up to gear ");
            System.out.println(getCurrentGear());
        } else {
            System.out.println("Highest gear already engaged. Cannot shift up any further.");
        }
    }

    public void shiftDown() {
        if (gear > MIN_GEAR) {
            gear -= 1;
            System.out.print("Shifted down to gear ");
            System.out.println(getCurrentGear());
        } else {
            System.out.println("Lowest gear already engaged. Cannot shift down any further.");
        }
    }

    public void switchRear() {
        if (gear == 0 || gear == 1) {
            gear  = -1;
            System.out.println("Rear gear engaged");
        } else {
            System.out.printf("Rear can only be engaged when in neutral or 1. Current gear is %s%n", getCurrentGear());
        }
    }

    public void switchNeutral() {
        gear = 0;
        System.out.println("Switched to neutral");
    }

    public int getCurrentGear() {
        return gear;
    }

}
