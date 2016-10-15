/**
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 * 
 * 
 * 
 * 
 * 
 */


package problem002;

public class Problem002 {
	
	public static void main (String[] args) {
		int a = 1;
		int b = 0;
		int currentTerm = 0;
		int evenTermsSum = 0;
		
		while(currentTerm < 4000000) {
			currentTerm = a + b;
			System.out.print(currentTerm + " ");
			b = a;
			a = currentTerm;
			if(currentTerm%2==0) {
				evenTermsSum = evenTermsSum + currentTerm;
			}
		}
		
	System.out.println();
	System.out.println("The sum of all even terms under 4 million: " + evenTermsSum);
	}

}
