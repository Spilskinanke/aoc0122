import java.util.Scanner;

public class NextLine {

    private static String line;

    public NextLine(Scanner scanner) {
        line = scanner.nextLine();
    }

    public static String get() {
        return line;
    }
}
