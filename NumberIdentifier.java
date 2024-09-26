public class NumberIdentifier {
    public static boolean isArabicNumber(String number) {
        if (number.matches("\\d+")) {
            int num = Integer.parseInt(number);
            return num >= 1 && num <= 10;
        } else {
            return false;
        }
    }

    public static boolean isRomanNumber(String number) {
        return number.matches("^[IVX]+$");
    }
}