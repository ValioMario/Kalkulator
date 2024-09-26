public class RomanCalcs extends Calculations {
    public RomanCalcs(int num1, int num2) {
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

    public String getRomanResult(int result) {
        if (result <= 0) {
            throw new IllegalArgumentException("Результат не может быть представлен римскими цифрами.");
        }
        return RomanNumeral.arabicToRoman(result);
    }
}