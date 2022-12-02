import java.util.List;

public class ListSize {



    private final int size;

    public ListSize(List<Integer> list) {
        size = list.size();
    }


    public int get() {
        return size;
    }
}
