package day9.Task2;

public class Triangle extends Figure {
    final private int lengthA;
    final private int lengthB;
    final private int lengthC;

    public Triangle(int lengthA, int lengthB, int lengthC, String color) {
        super(color);
        this.lengthA = lengthA;
        this.lengthB = lengthB;
        this.lengthC = lengthC;
    }

    @Override
    public double area() {
        double p = perimeter() / 2;
        return Math.sqrt(p * (p - lengthA) * (p - lengthB) * (p - lengthC));
    }

    @Override
    public double perimeter() {
        return lengthA + lengthB + lengthC;
    }

}

