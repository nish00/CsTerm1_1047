// Importing Scanner class
import java.util.Scanner;

// Declaration of class
public class TimerTest {

    // Declaration of main method
    public static void main(String[] args) {

        // Declaration of Scanner class
        Scanner input = new Scanner(System.in);
        
        // Making an array of Timer class
        Timer[] timerArr = new Timer[3];

        // Using for loop for input from user
        for(int i = 0; i<timerArr.length; i++ ) {
            // Prompting user for the input
            System.out.print("Enter three number: ");
            int hours = input.nextInt();
            int minutes = input.nextInt();
            int seconds = input.nextInt();
            // Storing the values in the timer array
            timerArr[i] = new Timer(hours, minutes, seconds);
        }
        // Printing the total of hours
        System.out.println("The total number of hours is "+(timerArr[0].getHours()+timerArr[1].getHours()+timerArr[2].getHours()));
        // Printing the total of minutes
        System.out.println("The total number of minutes is "+(timerArr[0].getMinutes()+timerArr[1].getMinutes()+timerArr[2].getMinutes()));
        // Printing the total of seconds
        System.out.println("The total number of seconds is "+(timerArr[0].getSeconds()+timerArr[1].getSeconds()+timerArr[2].getSeconds()));
    
    // Closing scanner class
    input.close();
    }
}