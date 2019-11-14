package exercise1;

public class Triangle {
    private Double base;
    private Double height;

    public Triangle(Double base, Double height) {
        this.base = base;
        this.height = height;
    }

    public Double getArea() {
        return (base * height) / 2;
    }

    public String printHtmlOuput() {
        return "<h1>Result:</h1><p>The areas is " + getArea() + "</p>";
    }
}