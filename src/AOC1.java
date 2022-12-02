import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.function.Function;

public class AOC1 {
    public AOC1() {

        new SetList();

        new SetElves(new Zero().get());
        new WhileCondition(() -> new HasNextLineCheck(new GetScanner().get()).get(), () -> {
            new NextLine(new GetScanner().get());
            new Conditional(() -> new SetElves(new IncrementByOne(new GetElves().get()).get()), () -> {
                new Conditional(() -> new ListAdd(new GetList().get(), new StringToInt(new GetLine().get()).get()),
                        () -> new SetAt(new GetList().get(),
                                new DecrementByOne(new ListSize(new GetList().get()).get()).get(),
                                new SumIntegers(new GetAt(new GetList().get(),
                                        new DecrementByOne(new ListSize(new GetList().get()).get()).get()).get(),
                                        new StringToInt(new GetLine().get()).get()).get()),
                        new NumberisLessOrEqual(new ListSize(new GetList().get()).get(), new GetElves().get()).get());
            }, new StringEmpty(new GetLine().get()).get());
        });

        new GetList().get().sort(Collections.reverseOrder());
        new Console(  new SumIntegers(new GetAt(new GetList().get(),
                new Zero().get()).get(), new SumIntegers(new GetAt(new GetList().get(),
                new One().get()).get(), new GetAt(new GetList().get(), new Two().get()).get()).get()).get());

    }

    public static void main(String[] args) {
        new AOC1();
    }


}

