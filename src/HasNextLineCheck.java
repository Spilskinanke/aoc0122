import java.util.Scanner;

public class HasNextLineCheck {

    private final boolean has;

    public HasNextLineCheck(Scanner scanner) {
        has = scanner.hasNextLine();
    }

    public boolean get() {
        return has;
    }
}
