public class ArithmeticCalculator {
    public int a = 0;
    public int b = 0;
    public final Operation type;
    public int result = 0;
    public ArithmeticCalculator(int a, int b, Operation type) {
        this.a = a;
        this.b = b;
        this.type = type;
    }
    public Operation getType() {
        return type;
    }

    public void calculate() {
        if (type == Operation.ADD){
            result = a + b;
        } else if (type == Operation.SUBTRACT) {
            result = a - b;
        }else if (type == Operation.MULTIPLY) {
            result = a * b;
        }
        System.out.println(result);

    }

}
