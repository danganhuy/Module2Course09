import org.junit.Assert;
import org.junit.Test;

public class Exercise4TestCase {
    @Test
    public void testDate0() {
        double a = 2;
        double b = 2;
        double c = 2;
        String expected = "Equilateral Triangle";

        String result = TriangleClassifier.classifyTriangle(a, b, c);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testDate1() {
        double a = 2;
        double b = 2;
        double c = 3;
        String expected = "Isosceles Triangle";

        String result = TriangleClassifier.classifyTriangle(a, b, c);
        Assert.assertEquals(expected, result);
    }


    @Test
    public void testDate2() {
        double a = 3;
        double b = 4;
        double c = 5;
        String expected = "Scalene Triangle";

        String result = TriangleClassifier.classifyTriangle(a, b, c);
        Assert.assertEquals(expected, result);
    }


    @Test
    public void testDate3() {
        double a = 8;
        double b = 2;
        double c = 3;
        String expected = "Not A Triangle";

        String result = TriangleClassifier.classifyTriangle(a, b, c);
        Assert.assertEquals(expected, result);
    }


    @Test
    public void testDate4() {
        double a = -1;
        double b = 2;
        double c = 1;
        String expected = "Not A Triangle";

        String result = TriangleClassifier.classifyTriangle(a, b, c);
        Assert.assertEquals(expected, result);
    }


    @Test
    public void testDate5() {
        double a = 0;
        double b = 1;
        double c = 1;
        String expected = "Not A Triangle";

        String result = TriangleClassifier.classifyTriangle(a, b, c);
        Assert.assertEquals(expected, result);
    }
}
