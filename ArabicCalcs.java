public class ArabicCalcs extends Calculations {
    public ArabicCalcs(int num1, int num2) {
        super(num1, num2);
    }

    @Override
    public int addition() {
        return num1 + num2;
    }

    @Override
    public int subtraction() {
        return num1 - num2;
    }

    @Override
    public int multiplication() {
        return num1 * num2;
    }

    @Override
    public int division() {
        if (num2 == 0) {
            throw new ArithmeticException("Деление на ноль невозможно.");
        }
        return num1 / num2;
    }
}