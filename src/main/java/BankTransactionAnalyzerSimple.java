import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * packageName    : PACKAGE_NAME
 * fileName       : BankTransactionAnalyzerSimple
 * author         : Mr.Lee
 * date           : 2025-02-06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-02-06        Mr.Lee      최초 생성
 */
public class BankTransactionAnalyzerSimple {
    private static final String RESOURCES = "src/main/resources";

    public static void main(final String... args) throws IOException{
        final Path path = Paths.get(RESOURCES + "/bank-data-simple.csv");
        final List<String> lines = Files.readAllLines(path);
        double total = 0d;
        for(final String line:lines){
            final String[] columns = line.split(",");
            final double amount = Double.parseDouble(columns[1]);
            total += amount;
        }
        System.out.println("The total for all transaction is "+ total);
    }
}
