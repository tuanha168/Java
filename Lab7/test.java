package Lab7;

public class TestVehicle {
    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
        // Create an object of child class and specify the values 
        FourWheeler objFour = new FourWheeler("LA-09 CS-1406", "Volkswagen", 4, true);
        objFour.showDetails(); // Invoke the child class method
        objFour.accelerate(200); // Invoke the inherited method


        Cylinder cy1 = new Cylinder();
        System.out.println("Radius is " + cy1.getRadius()
        + ", Height is " + cy1.getHeight()
        + ", Color is " + cy1.getColor()
        + ", Base area is " + cy1.getArea()
        + ", Volume is " + cy1.getVolume());


        /* Test Point2D */
        // Test constructors and toString()
        Point2D p2a = new Point2D(1, 2);
        System.out.println(p2a);  // toString()
        Point2D p2b = new Point2D();  // default constructor
        System.out.println(p2b);
        // Test Setters and Getters
        p2a.setX(3);  // Test setters
        p2a.setY(4);
        System.out.println(p2a);  // toString()
        System.out.println("x is: " + p2a.getX());
        System.out.println("y is: " + p2a.getY());

        /* Test Point3D */
        // Test constructors and toString()
        Point3D p3a = new Point3D(11, 12, 13);
        System.out.println(p3a);  // toString()
        Point3D p3b = new Point3D();  // default constructor
        System.out.println(p3b);
        // Test Setters and Getters
        p3a.setX(21);  // in superclass
        p3a.setY(22);  // in superclass
        p3a.setZ(23);  // in this class
        System.out.println(p3a);  // toString()
        System.out.println("x is: " + p3a.getX());  // in superclass
        System.out.println("y is: " + p3a.getY());  // in superclass
        System.out.println("z is: " + p3a.getZ());  // in this class
    }
}