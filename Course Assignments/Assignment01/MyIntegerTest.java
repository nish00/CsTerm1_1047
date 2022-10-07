public class MyIntegerTest {
    public static void main(String[] args) {
        MyInteger integer1 = new MyInteger(1);
        MyInteger integer5 = new MyInteger(5);
        MyInteger integer$1 = new MyInteger(1);

        System.out.println("Value of Integer 1 is: "+integer1.getValue());
        System.out.println("Value of Integer 5 is: "+integer5.getValue());
        System.out.println("Value of Integer $1 is: "+integer$1.getValue());

        System.out.println("Integer 1 is even: "+integer1.isEven());
        System.out.println("Integer 5 is even: "+integer5.isEven());

        System.out.println("Integer 1 is odd: "+integer1.isOdd());
        System.out.println("Integer 5 is odd: "+integer5.isOdd());

        System.out.println("Integer 1 is prime: "+integer1.isPrime());
        System.out.println("Integer 5 is prime: "+integer5.isPrime());

        System.out.println("The number 8 is even: "+MyInteger.isEven(8));
        System.out.println("The number 8 is odd: "+MyInteger.isOdd(8));
        System.out.println("The number 17 is prime: "+MyInteger.isPrime(17));
        System.out.println("The number 9 is prime: "+MyInteger.isPrime(9));
        
        System.out.println("The integer 1 is even: "+MyInteger.isEven(integer1));

        System.out.println("The integer 5 is odd: "+MyInteger.isOdd(integer5));

        System.out.println("The integer 5 is prime: "+MyInteger.isPrime(integer5));
        System.out.println("The integer 1 is prime: "+MyInteger.isPrime(integer1));

        System.out.println("The integer 1 is equal to 1: "+integer1.equals(1));
        System.out.println("The integer 5 is equal to 6: "+integer5.equals(6));

        System.out.println("Both integers 1 and 5 are equal: "+integer1.equals(integer5));
        System.out.println("Both integers 1 and $1 are equal: "+integer1.equals(integer$1));

        char[] charArray = {'1','2','3','4','5','6'};
        System.out.println(MyInteger.parseInt(charArray));

        String string = "123456";
        System.out.println(MyInteger.parseInt(string));
    }
}