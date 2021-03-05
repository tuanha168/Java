public class Circle {
    private double radius;
    private String color;

    public Circle() {
        radius = 1.0;
        color = "red";
    }
    public Circle(double r) {
        radius = r;
        color = "red";
    }
    public Circle(String c) {
        radius = 1.0;
        color = c;
    }
    public Circle(double r, String c) {
        radius = r;
        color = c;
    }
    public double getRadius() {
        return r;
    }
    public String getColor() {
        return color;
    }    
}