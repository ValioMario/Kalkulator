public abstract class Calculations {
    protected int num1;
    protected int num2;

    public Calculations(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public abstract int addition();
    public abstract int subtraction();
    public abstract int multiplication();
    public abstract int division();
}