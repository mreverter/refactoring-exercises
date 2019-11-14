package exercise1.solved;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(10D, 100D);
        ResultPrinter resultPrinter = new ResultPrinter();

        Double area = triangle.getArea();
        resultPrinter.printAsHtml(area);
    }
}
