import java.util.ArrayList;
import java.util.List;

public class GetList {

    private final ArrayList<Integer> list;


    public GetList() {
        list = SetList.get();
    }

    public ArrayList<Integer> get() {
        return list;
    }

}
