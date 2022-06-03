import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите данные для создания автомобиля!");
        System.out.println("Для начала опредедимся с типом двигателя. " +
                "Выбирете из следующего списка тип двигателя и набирите его с клавиатуры, соблюдая стиль написания" + "\n" +
                " и нажмите  Enter. PETROL, GAS, DIESEL, ELECTRO, HYBRID.");
        String inputEngine = new Scanner(System.in).nextLine();
        EngineType perem = EngineType.valueOf(inputEngine);
        System.out.println("Введите объем двигателя и нажмите  Enter");
        int volume = new Scanner(System.in).nextInt();
        System.out.println("Введите мощность двигателя и нажмите  Enter");
        int power = new Scanner(System.in).nextInt();
        Engine engine = new Engine(perem, volume, power);
        System.out.println("Введите вес автомобиля и нажмите Enter");
        int weight = new Scanner(System.in).nextInt();
        Car car = new Car(CarType.CABRIOLET, engine, weight);
        System.out.println(engine);
        System.out.println("");
        System.out.println(car);


    }



}
