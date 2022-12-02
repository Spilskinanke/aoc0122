import java.util.List;

public class GetAt {

    private final int result;

    public GetAt(List<Integer> list, int index) {
        result = list.get(index);
    }

    public int get() {
        return result;
    }
}
