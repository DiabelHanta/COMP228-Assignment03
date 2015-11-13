package question1;

import java.util.ArrayList;
import java.util.Collections;

//CLASS driver ####################################
public class DriverDieRoller 
{
	//METHOD main #################################
	public static void main(String[] args)
	{
		//Calling Die Classes
		Die die1 = new Die();
		Die die2 = new Die();
		int sum;
		
		//PUBLIC INSTANCE VARIABLES
//		int sum = die1 + die2;
		
		//array to hold the number of instance (36000)
		ArrayList<Integer> _total = new ArrayList<>();
		
		//Loop - calling dies and adding them to the arraylist
		for(int count = 0; count < 32000; count++)
		{
			//Calling Die methods
			int d1=die1.getDie();
			int d2=die2.getDie();
			_total.add(d1 + d2); //adds to the arraylist
//			sum = die1.getDie() + die2.getDie();
		}//for
		
//		sum = die1.getDie() + die2.getDie();
		
		//Checking Frequency (number of times) of each number that has been "rolled"
		int numberOfTimes2 = Collections.frequency(_total, 2);
		int numberOfTimes3 = Collections.frequency(_total, 3);
		int numberOfTimes4 = Collections.frequency(_total, 4);
		int numberOfTimes5 = Collections.frequency(_total, 5);
		int numberOfTimes6 = Collections.frequency(_total, 6);
		int numberOfTimes7 = Collections.frequency(_total, 7);
		int numberOfTimes8 = Collections.frequency(_total, 8);
		int numberOfTimes9 = Collections.frequency(_total, 9);
		int numberOfTimes10 = Collections.frequency(_total, 10);
		int numberOfTimes11 = Collections.frequency(_total, 11);
		int numberOfTimes12 = Collections.frequency(_total, 12);
		
		//Outputs
//		System.out.printf("Your sums are: %d\n%n", sum);
		
		System.out.printf("The following below shows the number of times each NUMBER has occured!\n%n");	
		System.out.printf("2 - %d times\n", numberOfTimes2);
		System.out.printf("3 - %d times\n", numberOfTimes3);
		System.out.printf("4 - %d times\n", numberOfTimes4);
		System.out.printf("5 - %d times\n", numberOfTimes5);
		System.out.printf("6 - %d times\n", numberOfTimes6);
		System.out.printf("7 - %d times\n", numberOfTimes7);
		System.out.printf("8 - %d times\n", numberOfTimes8);
		System.out.printf("9 - %d times\n", numberOfTimes9);
		System.out.printf("10 - %d times\n", numberOfTimes10);
		System.out.printf("11 - %d times\n", numberOfTimes11);
		System.out.printf("12 - %d times\n", numberOfTimes12);
		
	}//main
}//class