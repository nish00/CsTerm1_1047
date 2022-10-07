// Declaration of class
public class MyIntegerTest {

    // Declaration of main method
    public static void main(String[] args) {
        // Declaration of objects
        MyInteger integer1 = new MyInteger(1);
        MyInteger integer5 = new MyInteger(5);
        MyInteger integer$1 = new MyInteger(1);

        // Printing value of integer using getter method
        System.out.println("Value of Integer 1 is: "+integer1.getValue());
        System.out.println("Value of Integer 5 is: "+integer5.getValue());
        System.out.println("Value of Integer $1 is: "+integer$1.getValue());

        // Checking Even and Printing final value on the terminal 
        System.out.println("Integer 1 is even: "+integer1.isEven());
        System.out.println("Integer 5 is even: "+integer5.isEven());

        // Checking Odd and Printing final value on the terminal
        System.out.println("Integer 1 is odd: "+integer1.isOdd());
        System.out.println("Integer 5 is odd: "+integer5.isOdd());

        // Checking Prime and Printing final value on the terminal
        System.out.println("Integer 1 is prime: "+integer1.isPrime());
        System.out.println("Integer 5 is prime: "+integer5.isPrime());

        // Checking even/odd/prime number using static method and printing final value on terminal
        System.out.println("The number 8 is even: "+MyInteger.isEven(8));
        System.out.println("The number 8 is odd: "+MyInteger.isOdd(8));
        System.out.println("The number 17 is prime: "+MyInteger.isPrime(17));
        System.out.println("The number 9 is prime: "+MyInteger.isPrime(9));
        
        // Checking even/odd/prime object using static method and printing final value on terminal
        System.out.println("The integer 1 is even: "+MyInteger.isEven(integer1));
        System.out.println("The integer 5 is odd: "+MyInteger.isOdd(integer5));
        System.out.println("The integer 5 is prime: "+MyInteger.isPrime(integer5));
        System.out.println("The integer 1 is prime: "+MyInteger.isPrime(integer1));

        // Comparing equality of two objects and printing final value on terminal
        System.out.println("The integer 1 is equal to 1: "+integer1.equals(1));
        System.out.println("The integer 5 is equal to 6: "+integer5.equals(6));
        System.out.println("Both integers 1 and 5 are equal: "+integer1.equals(integer5));
        System.out.println("Both integers 1 and $1 are equal: "+integer1.equals(integer$1));

        // Parsing numeric array into int data type and printing it on terminal
        char[] charArray = {'1','2','3','4','5','6'};
        System.out.println(MyInteger.parseInt(charArray));

        // Parsing string into int data type and printing it on terminal
        String string = "123456";
        System.out.println(MyInteger.parseInt(string));
    }
}