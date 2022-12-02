public class GetLine {

    private final String line;

    public GetLine() {
        line = NextLine.get();
    }

    public String get() {
        return line;
    }
}
