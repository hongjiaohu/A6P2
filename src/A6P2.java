import java.util.Scanner;

/**
 * Name: Hongjiao Hu
 * Teacher: Mr. Hardman
 * Assignment 6, Program 2
 * Date Last Modified: 12/15/2016
 */

/**
 * @author h.hu
 *
 */
public class A6P2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		
		double[] student1 = {56.2, 65.7, 45.32, 89.213, 65, 76, 54, 98, 45, 87.2};
		
		double[] student2 = new double[10];
		
		double average1 = calcAverage( student1 );
		double average2 = calcAverage( student2 );
		
		System.out.println("Please enter ten marks to be averaged:");
		
		for(int i = 0; i < student2.length; i++){
			System.out.print("Please enter a mark: ");
			student2[i] = userInput.nextDouble();
		}
		
		if(average2 > average1){
			
			System.out.println("Your average is greater than student 1's by " + (average2 - average1) + " points.");
			
		} else if(average2 < average1){
			
			System.out.println("Your average is less than student 1's by " + (average1 - average2) + " points.");
			
		} else {
			
			System.out.println("Your average is equal to student 1's.");
			
		}
		
		userInput.close();
		

	}
	
	/**
	 * calcAverage will calculate the average
	 *
	 * @param marks are the number to average
	 * @return the calculate for the given number
	 */
	
	public static double calcAverage( double[] marks ){
		
		double sum = 0;
		double average = 0;
		double[] student1 = {56.2, 65.7, 45.32, 89.213, 65, 76, 54, 98, 45, 87.2};
		
		for(int i = 0; i < student1.length; i++){
			sum += student1[i];
		}
		
		average = sum / student1.length;
		
		return sum = 0;
			
		}
		

	
}

