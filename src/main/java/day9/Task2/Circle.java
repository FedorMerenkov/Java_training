package day9.Task2;

import java.util.Objects;

public class Circle extends Figure {

    final private int r;

    public Circle(int R, String color) {
        super(color);
        this.r = R;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return r == circle.r;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(r);
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * r;
    }

}
