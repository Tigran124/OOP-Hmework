public class Circle {
    double radius;
    String color;

    public Circle() {
        radius = 0;
        color = "black";
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getarea() {
        return Math.PI*(radius*radius);
    }
}
