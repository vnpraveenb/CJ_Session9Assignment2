/**
 * 
 */
package setcopy;

import java.util.*;

/**
 *This class is used to copy all the elements from set2 to set1 so that the set1 becomes the union of
 * set1 and set2.
 *
 * @author Praveen
 */
public class SetCopy {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		// Instantiated 2 set objects using empty constructor
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();

		/* --- Getting the range of members(integers) of the 1st set ---- */
		System.out.println("Input the number range you want to put into the 1st Set ");
		Scanner scan = new Scanner(System.in);
		
		// Getting the value of the lowest number of the range from the user
		System.out.println("Input the lowest number of the range: ");
		int lowestNum = scan.nextInt();
		
		// Getting the value of the highest number of the range from the user
		System.out.println("Input the highest number of the range: ");
		int highestNum = scan.nextInt();
		
		// Adding the numbers in the range into the 1st set
		for(int i = lowestNum; i<=highestNum; i++)
		{
			set1.add(i);
		}
		
		// Printing the elements of the set
		System.out.println("Elements of the 1st Set: " +set1.toString());

		
		/* --- Getting the range of members(integers) of the 2nd set ---- */
		System.out.println("\nInput the number range you want to put into the 2nd Set ");
		
		// Getting the value of lowest number of the range from the user
		System.out.println("Input the lowest number of the range: ");
		lowestNum = scan.nextInt();
		
		// Getting the value of the highest number of the range from the user
		System.out.println("Input the highest number of the range: ");
		highestNum = scan.nextInt();
		
		// Adding the numbers in the range into the 2nd set
		for(int i = lowestNum; i<=highestNum; i++)
		{
			set2.add(i);
		}
		
		// Printing the elements of the set
		System.out.println("Elements of the 2nd Set: " +set2.toString());

		
		System.out.println("\nCopying all the elements of the 2nd set to the 1st Set");
		// Copying all the elements of the 2nd set to the 1st Set
		set1.addAll(set2);
		
		//Printing the elements of the 1st which should be the union of set1 and set2
		System.out.println("\nElements of the 1st set are: " + set1.toString());
		
		scan.close(); //Closing the scanner object
	}

}
