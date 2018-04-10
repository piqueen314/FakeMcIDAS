package edu.fake.ssec;
import edu.fake.ssec.anotherFakePackage.fakeMcIDASClass;
import edu.fake.ssec.fakeHydra.fakeHydraClass1;
import java.util.Arrays;

/**
 * Fake McIDAS app.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // use some of the fakeMcIDAS classes
        fakeMcIDASClass fmc = new fakeMcIDASClass();
        fmc.printClassName();

        // now the app uses some of the fakeHydra classes
        fakeHydraClass1 fhc = new fakeHydraClass1();
        double [][] data = {{10.0, 3.0, 7.0, 6.0}, {1.0, 12.0, 15.0, 2.0}, {3.0, 9.0, 11.0, 7.0}};
        double [] columnSums = fhc.columnSums(data);
        String colSimStrings = Arrays.toString(columnSums);
        System.out.print(colSimStrings);


    }
}
