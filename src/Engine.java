public class Engine {
    final EngineType engineType;
    final double displacement;
    final int power;

    public Engine(EngineType engineType, double displacement, int power) {
        this.engineType = engineType;
        this.displacement = displacement;
        this.power = power;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public double getDisplacement() {
        return displacement;
    }

    public int getPower() {
        return power;
    }
}
