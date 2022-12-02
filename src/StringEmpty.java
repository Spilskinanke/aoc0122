public class StringEmpty {

    private final boolean equals;
    public StringEmpty(String next) {
        equals = next.equals("");
    }


    public boolean get() {
        return equals;
    }
}
