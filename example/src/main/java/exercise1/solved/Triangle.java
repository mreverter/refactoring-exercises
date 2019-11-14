package exercise1.solved;

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
}