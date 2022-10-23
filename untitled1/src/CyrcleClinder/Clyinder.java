public class Clyinder extends Circle{
    double hight;

    public Clyinder() {
        super();
    }

    public Clyinder(double radius) {
        this.radius = radius;
    }

    public Clyinder(double radius,double hight) {
        this.radius = radius;
        this.hight = hight;
    }

    public double getHight() {
        return hight;
    }

    public double getArea() {
        return 2*Math.PI*radius*(radius+hight);
    }
}
