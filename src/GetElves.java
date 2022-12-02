public class GetElves {

    private final int elves;


    public GetElves() {
        elves = SetElves.get();
    }

    public int get() {
        return elves;
    }
}
