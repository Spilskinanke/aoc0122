public class StringToInt {


    private final int num;

    public StringToInt(String string) {
        num = Integer.parseInt(string);
    }

    public int get() {
        return num;
    }
}
