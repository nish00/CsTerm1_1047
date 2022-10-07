// Declaration of Class
public class Circle2D {
    // Declaration of data
    private double x;
    private double y;
    private double radius;
    public final double PI = 3.14;

    // Declaration of no arg constructor
    public Circle2D() {
        this.x = 0;
        this.y = 0;
        this.radius = 1;
    }
    // Declaration of constructor with arguments
    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    // Method to get X value
    public double getX() {
        return x;
    }

    // Method to get Y value
    public double getY() {
        return y;
    }

    // Method to get radius
    public double getRadius() {
        return radius;
    }

    // Method to get area
    public double getArea() {
        double area = PI*(radius*radius);
        return area;
    }

    // Method to get the perimeter
    public double getPerimeter() {
        double perimeter = 2*PI*radius;
        return perimeter;
    }

    // Method to check the position of coordinates
    public boolean contains(double x, double y) {
        boolean doContain = false;
        double finalX = x-this.x;
        double finalY = x-this.y;         
        if ((Math.pow(finalX, 2))+(Math.pow(finalY, 2)) < (Math.pow(this.radius, 2))) {
            doContain = true;
        }
        else
            doContain = false;
        return doContain;
    }

    // Method to check if the Circle2D object is contained in the given circle
    public boolean contains(Circle2D circle) {
        boolean doContain = false;
        double finalX = circle.getX()-this.x;
        double finalY = circle.getY()-this.y;
        double reqLength = Math.sqrt(Math.pow(finalX, 2)+Math.pow(finalY, 2));
        if ((reqLength+circle.getRadius())<this.radius) {
            doContain = true;
        }
        else 
            doContain = false;
        return doContain;
    }

    // Method to check if the Circle2D object intersects with the given circle
    public boolean overlaps(Circle2D circle) {
        boolean doContain = false;
        double finalX = circle.getX()-this.x;
        double finalY = circle.getY()-this.y;
        double reqLength = Math.sqrt(Math.pow(finalX, 2)+Math.pow(finalY, 2));
        if ((reqLength < this.radius+circle.getRadius())) {
            doContain = true;
        }
        else
            doContain = false;
        return doContain;
    }
}