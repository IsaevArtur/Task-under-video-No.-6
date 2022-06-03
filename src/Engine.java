public class Engine {
    public final EngineType enginesType;
    public final double volume;//объём
    public  final int power;//мощность
    public Engine(EngineType enginesType, double volume, int power) {
        this.enginesType = enginesType;
        this.volume = volume;
        this.power = power;
    }

    public EngineType getEnginesType() {
        return enginesType;
    }

    public double getVolume() {
        return volume;
    }

    public int getPower() {
        return power;
    }
    public String toString() {
        return "Тип топлива, на котором работает двигатель: " + enginesType + "." + "\n" +
                "Объём: " + volume + " литров." + "\n" + "Мощность: " + power + " кВт.";
    }


}
