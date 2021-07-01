package exe1;

import org.junit.Assert;
import org.junit.Test;

public class TestCalculator {

    @Test
    public void testCalc() throws Exception {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 5);
        Assert.assertEquals( 7, result);
    }
}
