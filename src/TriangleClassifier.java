public class TriangleClassifier {
    public static String classifyTriangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || b + c <= a || c + a <= b) {
            return "Not A Triangle";
        }
        if (a == b && b == c) {
            return "Equilateral Triangle";
        }
        if (a == b || b == c || c == a) {
            return "Isosceles Triangle";
        }
        return "Scalene Triangle";
    }
}
