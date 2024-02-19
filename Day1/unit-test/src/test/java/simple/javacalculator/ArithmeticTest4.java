package simple.javacalculator;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import simple.Calculator.ArithmaticOPerator;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class ArithmeticTest4 {

    private ArithmaticOPerator calc ;

    @BeforeMethod
    public void setup() {
        calc = new ArithmaticOPerator();
    }

    @Test (dataProvider = "provideTestDataSum")
    public void testSum(int Input1, int Input2, int Expectedresults){
        int result = calc.sum(Input1, Input2);

        Assert.assertEquals(result, Expectedresults, "Failed");
    }

    @Test (dataProvider = "provideTestDataSub")
    public void testSub(int Input1, int Input2, int Expectedresults){
        int result = calc.sub(Input1, Input2);

        Assert.assertEquals(result, Expectedresults, "Failed");
    }

    @DataProvider
    public Object[][] provideTestDataSum() throws IOException, CsvException {
        String csvFile = "resources/testdata.csv";
        CSVReader csvReader = new CSVReader(new FileReader(csvFile));

        // Read all rows from the CSV file
        List<String[]> csvData = csvReader.readAll();

        // Create a 2D array to store data for each test case
        Object[][] testData = new Object[csvData.size()][3];

        // Populate the array with data from the CSV file
        for (int i = 0; i < csvData.size(); i++) {
            String[] row = csvData.get(i);
            testData[i] = new Object[]{Integer.parseInt(row[0]), Integer.parseInt(row[1]), Integer.parseInt(row[2])};
        }

        return testData;
    }

    @DataProvider
    public Object[][] provideTestDataSub() throws IOException, CsvException {
        String csvFile = "resources/testdata2.csv";
        CSVReader csvReader = new CSVReader(new FileReader(csvFile));

        // Read all rows from the CSV file
        List<String[]> csvData = csvReader.readAll();

        // Create a 2D array to store data for each test case
        Object[][] testData = new Object[csvData.size()][3];

        // Populate the array with data from the CSV file
        for (int i = 0; i < csvData.size(); i++) {
            String[] row = csvData.get(i);
            testData[i] = new Object[]{Integer.parseInt(row[0]), Integer.parseInt(row[1]), Integer.parseInt(row[2])};
        }

        return testData;
    }

}
