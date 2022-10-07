// Declaration of main class
public class Circle2DTest {

    // Declaration of main method
    public static void main(String[] args) {
        // Defining a circle c1 with the given arguments
        Circle2D c1 = new Circle2D(2,2,5.5);

        // Printing the area using getter method for area
        System.out.println("The area of circle is: "+c1.getArea());

        // Printing the perimeter using getter method for perimeter
        System.out.println("The perimeter of circle is: "+c1.getPerimeter());

        // Checking if the points provided inside the circle and printing the final value in terminal
        System.out.println("Are the points in the circle: "+c1.contains(3, 3));

        // Checking if the circle is enclosed in the circle and printing the value on terminal
        System.out.println("Is the circle enclosed in the provided circle: "+c1.contains(new Circle2D(4, 5, 10.5)));

        // Checking if the circle overlaps each other and printing the value on terminal
        System.out.println("Does the circle overlaps the provide circle: "+c1.overlaps(new Circle2D(3, 5, 2.3)));

    }
}