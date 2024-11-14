import org.junit.Assert;
import org.junit.Test;

public class Exercise5TestCase {
    @Test
    public void testDate0() {
        int number = 3;
        String expected = "Fizz";

        String result = FizzBuzz.fizzOrBuzz(number);
        Assert.assertEquals(expected, result);
    }
    @Test
    public void testDate1() {
        int number = 5;
        String expected = "Buzz";

        String result = FizzBuzz.fizzOrBuzz(number);
        Assert.assertEquals(expected, result);
    }
    @Test
    public void testDate2() {
        int number = 45;
        String expected = "FizzBuzz";

        String result = FizzBuzz.fizzOrBuzz(number);
        Assert.assertEquals(expected, result);
    }
    @Test
    public void testDate3() {
        int number = 23;
        String expected = "23";

        String result = FizzBuzz.fizzOrBuzz(number);
        Assert.assertEquals(expected, result);
    }
}
