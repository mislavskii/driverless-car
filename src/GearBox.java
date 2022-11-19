public class GearBox {
    private int gear = 0;
    private int maxGear = 6;
    private int minGear = 1;

    public GearBox(int maxGear) {
        this.maxGear = maxGear;
    }

    public void shiftUp() {
        if (gear < maxGear) {
            gear += 1;
        } else {
            System.out.println("Highest gear already engaged. Cannot shift up any further.");
        }
    }

    public void shiftDown() {
        if (gear > minGear) {
            gear -= 1;
        } else {
            System.out.println("Lowest gear already engaged. Cannot shift down any further.");
        }
    }

    public void switchRear() {
        if (gear == 0 || gear == 1) {
            gear  = -1;
        } else {
            System.out.printf("Rear can only be engaged when in neutral or 1. Current gear is %s%n", getCurrentGear());
        }
    }

    public void switchNeutral() {
        gear = 0;
    }

    public int getCurrentGear() {
        return gear;
    }

}
