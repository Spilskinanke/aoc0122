public class Conditional {


    public Conditional(Runnable iff, Runnable elsee, boolean cond) {
        if (cond) {
            iff.run();
        } else {
            elsee.run();
        }
    }
}
