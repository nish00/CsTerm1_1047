// Declaration of class
public class Timer{

    // Declaration of instance data
    private int hours;
    private int minutes;
    private int seconds;

    // Declaration of no args constructor
    public Timer(){
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    // Declaration of constructor with arguments
    public Timer(int hours, int minutes, int seconds){
        
        // Using if statement for storing values
        if(hours>=0){
            this.hours = hours;
        }
        else this.hours = 0;

        if(minutes>=0){
            this.minutes = minutes;           
        }
        else this.minutes = 0;

        if(seconds>=0) {
            this.seconds = seconds;
        }
        else this.seconds = 0;
    }

    // Declaration of setter method(hours) for java with if statement for storing appropriate value
    public void setHours(int hours) {
        if (hours>=0) {
            this.hours = hours;
        }
        else this.hours = 0;
    }
    // Declaration of setter method(minutes)
    public void setMinutes(int minutes) {
        if (minutes>=0) {
            this.minutes = minutes;
        }
        else this.minutes = 0;
    }
    // Declaration of setter method(seconds)
    public void setSeconds(int seconds) {
        if (seconds>=0) {
            this.seconds = seconds;
        }
        else this.seconds = 0;
    }
    // Declaration of getter method for hours
    public int getHours() {
        return hours;
    }
    // Declaration of getter method for minutes
    public int getMinutes() {
        return minutes;
    }
    // Declaration of getter method for seconds
    public int getSeconds() {
        return seconds;
    }
}