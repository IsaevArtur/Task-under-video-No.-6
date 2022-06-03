public class Car {
    public final CarType type;
    public final Engine engine;
    public final int weight;//вес

    public Car(CarType type, Engine engine, int weight) {
        this.type = type;
        this.engine = engine;
        this.weight = weight;
    }
    public CarType getType() {
        return type;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return "Кузов автомобиля: " + type + "." + "\n" +
                "Двигатель: " + "\n" + engine + "\n" +
                "Вес: " + weight + " кг.";
    }

}
