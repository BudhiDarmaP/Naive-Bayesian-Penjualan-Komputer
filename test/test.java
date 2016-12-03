import Connection.DatabaseManager;
import Model.Data;
import Model.NaiveBayes;
import Model.Probabilitas;
import java.util.Arrays;

/**
 *
 * @author budhidarmap
 */
public class test {
    public static void main(String[] args) {
        NaiveBayes nb = new NaiveBayes();
        DatabaseManager db = new DatabaseManager();
        System.out.println("Probabilitas Yes:"+nb.yes(">40", "low", "yes", "excellent"));
        System.out.println("Probabilitas No:"+nb.no(">40", "low", "yes", "excellent"));
        System.out.println(nb.check(">40", "low", "yes", "excellent"));
    }
}
