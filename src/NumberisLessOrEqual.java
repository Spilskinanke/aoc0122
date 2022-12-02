public class NumberisLessOrEqual {

    private final boolean lessoreq;


    public NumberisLessOrEqual(int num1, int num2) {
        lessoreq = num1 <= num2;
    }

    public boolean get() {
        return lessoreq;
    }
}
