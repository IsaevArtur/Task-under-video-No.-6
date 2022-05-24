import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число а и нажмите Enter");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Введите число b и нажмите Enter");
        int b = new Scanner(System.in).nextInt();
        System.out.println("Введите операциюю с клавиатуры, " +
                "где  ADD это сложение, SUBTRACT это вычитание, MULTIPLY это умножение и нажмите Enter");
        String inputOperation = new Scanner(System.in).nextLine();
        Operation type = Operation.valueOf(inputOperation);
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(a, b, type);
        arithmeticCalculator.calculate();


    }



}
