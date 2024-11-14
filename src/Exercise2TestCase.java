import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class Exercise2TestCase {

    @Test
    public void testFindAbsolute0() {
        int number = 0;
        int expected = 0;

        int result = Absolute.findAbsolute(number);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testFindAbsolute1() {
        int number = 1;
        int expected = 1;

        int result = Absolute.findAbsolute(number);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testFindAbsoluteNegative1() {
        int number = -1;
        int expected = 1;

        int result = Absolute.findAbsolute(number);
        Assert.assertEquals(expected, result);
    }
}