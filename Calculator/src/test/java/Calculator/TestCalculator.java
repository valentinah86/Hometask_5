package Calculator;

import org.testng.Assert;
import org.testng.annotations.Test;


@Test
public class TestCalculator {

   private Calculation calculation = new Calculation();


    public void testSum () throws Exception {
        Assert.assertEquals(10.10, calculation.summarize(7.05, 3.05));
    }

    public void testSubtraction() throws Exception {
        Assert.assertEquals(-25.1, calculation.subtract(25.1, 50.2));
    }

    public void testDivision() throws Exception{
        Assert.assertEquals(5.625, calculation.divide( 45, 8));
    }

    public void testMultiplication () throws Exception {
        Assert.assertEquals(-50.0, calculation.multiply(-25, 2));
    }

}
