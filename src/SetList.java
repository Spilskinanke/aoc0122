import java.util.ArrayList;

public class SetList {

    private static ArrayList<Integer> list;

    public SetList() {
        list = new ArrayList<>();
    }

    public static ArrayList<Integer> get() {
        return list;
    }
}
