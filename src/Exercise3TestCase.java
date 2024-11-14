import org.junit.Assert;
import org.junit.Test;

public class Exercise3TestCase {

    @Test
    public void testDate0() {
        int[] input = new int[]{1,1,2018};
        int[] expected = new int[]{2,1,2018};

        int[] result = NextDayCalculator.nextDay(input[0],input[1],input[2]);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void testDate1() {
        int[] input = new int[]{31,1,2018};
        int[] expected = new int[]{1,2,2018};

        int[] result = NextDayCalculator.nextDay(input[0],input[1],input[2]);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void testDate2() {
        int[] input = new int[]{29,2,2020};
        int[] expected = new int[]{1,3,2020};

        int[] result = NextDayCalculator.nextDay(input[0],input[1],input[2]);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void testDate3() {
        int[] input = new int[]{30,4,2018};
        int[] expected = new int[]{1,5,2018};

        int[] result = NextDayCalculator.nextDay(input[0],input[1],input[2]);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void testDate4() {
        int[] input = new int[]{28,2,2018};
        int[] expected = new int[]{1,3,2018};

        int[] result = NextDayCalculator.nextDay(input[0],input[1],input[2]);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void testDate5() {
        int[] input = new int[]{31,12,2018};
        int[] expected = new int[]{1,1,2019};

        int[] result = NextDayCalculator.nextDay(input[0],input[1],input[2]);
        Assert.assertArrayEquals(expected, result);
    }
}
