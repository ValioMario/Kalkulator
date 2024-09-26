import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число (арабское или римское):");
        String num1Str = scanner.next();
        int num1 = NumberIdentifier.isArabicNumber(num1Str) ? Integer.parseInt(num1Str) : RomanNumeral.romanToArabic(num1Str);

        System.out.println("Введите операцию (+, -, *, /):");
        char operation = scanner.next().charAt(0);

        System.out.println("Введите второе число (арабское или римское):");
        String num2Str = scanner.next();
        int num2 = NumberIdentifier.isArabicNumber(num2Str) ? Integer.parseInt(num2Str) : RomanNumeral.romanToArabic(num2Str);

        if (num1 < 1 || num1 > 10 || num2 < 1 || num2 > 10) {
            System.out.println("Числа должны быть в диапазоне от 1 до 10.");
            return;
        }

        Calculations calculator;
        if (NumberIdentifier.isArabicNumber(num1Str) && NumberIdentifier.isArabicNumber(num2Str)) {
            calculator = new ArabicCalcs(num1, num2);
        } else if (NumberIdentifier.isRomanNumber(num1Str) && NumberIdentifier.isRomanNumber(num2Str)) {
            calculator = new RomanCalcs(num1, num2);
        } else {
            System.out.println("Оба числа должны быть в одной системе счисления.");
            return;
        }

        int result = 0;
        switch (operation) {
            case '+':
                result = calculator.addition();
                break;
            case '-':
                result = calculator.subtraction();
                break;
            case '*':
                result = calculator.multiplication();
                break;
            case '/':
                result = calculator.division();
                break;
            default:
                System.out.println("Неверная операция.");
                return;
        }

        if (calculator instanceof RomanCalcs) {
            if (result > 0) {
                System.out.println("Результат: " + ((RomanCalcs) calculator).getRomanResult(result));
            } else {
                System.out.println("Результат не может быть представлен римскими цифрами.");
            }
        } else {
            System.out.println("Результат: " + result);
        }
    }
}