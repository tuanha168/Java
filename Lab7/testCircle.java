package Lab7;


public class testCylinder {
    public static void main(String[] args) {
        Cylinder cy1 = new Cylinder();
        System.out.println("Radius is " + cy1.getRadius()
        + ", Height is " + cy1.getHeight()
        + ", Color is " + cy1.getColor()
        + ", Base area is " + cy1.getArea()
        + ", Volume is " + cy1.getVolume());
    }
}