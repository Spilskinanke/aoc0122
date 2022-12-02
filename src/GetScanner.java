import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GetScanner {


    private static final Scanner staticscanner;

    static {
        try {
            staticscanner = new Scanner(new File("src/input"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private final Scanner scanner;

    public GetScanner() {
        scanner = staticscanner;
    }

    public Scanner get() {
        return scanner;
    }
}
