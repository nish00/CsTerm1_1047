// Declaration of class
public class MyInteger {
    // Declaration of data
    private int value;

    // Declaration of constructor for storing values
    public MyInteger(int value){
    this.value = value;
    }

    // Method for get value
    public int getValue(){
        return value;
    } 

    // Method for checking even
    public boolean isEven() {
        if (value % 2 == 0)
            return true;
        else 
            return false;
    }

    // Method for checking odd
    public boolean isOdd()  {
        if (value % 2 != 0)
            return true;
        else
            return false;
    } 

    // Method for checking prime number
    public boolean isPrime() {
        boolean isPrime = true;
        if (value<=1) {
            isPrime = false;
            return isPrime;
        }
        else {
            for(int i = 2; i<=value/2;i++){
                if (value%i == 0){
                    isPrime = false;
                    break;
                }
            }
        return isPrime;
        }
    }

    // Static method for checking even
    public static boolean isEven(int number) {
        if (number % 2 == 0)
            return true;
        else 
            return false;
    }

    // Static method for checking odd
    public static boolean isOdd(int number)  {
        if (number % 2 != 0)
            return true;
        else
            return false;
    }

    // Static method for checking prime
    public static boolean isPrime(int number) {
        boolean isPrime = true;
        if (number<=1) {
            isPrime = false;
            return isPrime;
        }
        else {
            for(int i = 2; i<=number/2;i++){
                if (number%i == 0){
                    isPrime = false;
                    break;
                }
            }
        return isPrime;
        }
    }

    // Static method for checking even for MyInteger object
    public static boolean isEven(MyInteger number) {
        return number.isEven();
    }

    // Static method for checking odd for MyInteger object
    public static boolean isOdd(MyInteger number) {
        return number.isOdd();
    }

    // Static method for checking prime for MyInteger object
    public static boolean isPrime(MyInteger number) {
        return number.isPrime();
    }
    
    // Method for comparing value with an integer 
    public boolean equals(int number) {
        if (this.value == number)
            return true;
        else
            return false;
    }
    
    // Method for comparing values stored in two objects
    public boolean equals(MyInteger number) {
        if(this.value == number.getValue()) {
            return true;
        }
        return false;
    }

    // Method for parsing char array into integer
    public static int parseInt(char[] charArray) {
        int number = Integer.parseInt(String.valueOf(charArray));
        return number;
    }

    // Method for parsing string into an integer
    public static int parseInt(String string) {
        int number = Integer.valueOf(string);
        return number;
    }
}