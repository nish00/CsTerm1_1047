public class Circle2DTest {
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2,2,5.5);

        System.out.println("The area of circle is: "+c1.getArea());

        System.out.println("The perimeter of circle is: "+c1.getPerimeter());

        System.out.println("Are the points in the circle: "+c1.contains(3, 3));

        System.out.println("Is the circle enclosed in the provided circle: "+c1.contains(new Circle2D(4, 5, 10.5)));

        System.out.println("Does the circle overlaps the provide circle: "+c1.overlaps(new Circle2D(3, 5, 2.3)));

    }
}