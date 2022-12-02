import java.util.function.Function;
import java.util.function.Supplier;

public class WhileCondition {




    public WhileCondition(Supplier<Boolean> check, Runnable run) {
        new Conditional(() -> {
            run.run();
            new WhileCondition(check, run);
        }, () -> {}, check.get());
    }
}
