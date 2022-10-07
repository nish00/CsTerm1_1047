import java.math.BigDecimal;
// Declaration of class
public class BigNumber {

    // Declaration of main method
	public static void main(String[] args) {

        // Using for loop for looping on all numbers
		for (BigDecimal i = new BigDecimal("100"); i.compareTo(new BigDecimal("1000")) <= 0; i = i.add(new BigDecimal("100"))) {
			System.out.println("The number is "+i + "\n" + total(i));
        } 
	}
	
    // Declaration of method for calculation
    public static BigDecimal total(BigDecimal number) {
        // Declaration of Bigdecimal numbers for storing number 1 and variable for final number
        BigDecimal finalNumber = new BigDecimal("0.0");
		BigDecimal one = new BigDecimal("1");

        // Using nested loops for for looping on addition and factorial multiplication 
		for (BigDecimal i = one; i.compareTo(number) <= 0; i = i.add(one)) {
			BigDecimal lowerValue = i;
			for (BigDecimal l = i.subtract(one); l.compareTo(one) >= 1; l = l.subtract(one)) {
				lowerValue = lowerValue.multiply(l);
			}

			// Storing the final value in final number with 25 digits precision
			finalNumber = finalNumber.add(one.divide(lowerValue, 25, BigDecimal.ROUND_UP));  
		}
        // Returning the final number
		return finalNumber;
	}
}