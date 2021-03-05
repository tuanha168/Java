public class Excircle {
    private double radius;


    public Excircle() {
        this.radius = 1.0;
    }

    public Excircle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }

    public double getCircumference() {
        return 2*Math.PI*radius;
    }

    public String toString() {
        return "exCircle[radius="+radius+"]";
    }
}