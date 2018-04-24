package Project1;

import java.util.Scanner;

public class ChangeMaker {
/* Requirements
		 * User Experience 
		 * Requires user input
		 * user input range should be .1c to .99c
		 * user expects app to Produce change in the form of
		 *  quarters, dimes, nickels, pennies
		 *  
		 *  App Development: the task needed to construct the app
		 *  App needs to accept user input
		 *  App needs to deny inputs over .99 and input under 0
		 *  App need to Display what the user needs to input("enter change")
		 *  
		 *  test 
		 *  checks for bugs
		 *  make sure it works
		 */
	public static void main(String[] args) {
		
	int price;
	int amount;
	int total = 0;
		
	Scanner input = new Scanner(System.in);
	System.out.print("Enter item price ");
	price = input.nextInt();
	
	///
	
	Scanner input2 = new Scanner(System.in);
	System.out.print("Enter customer amount ");
	amount = input2.nextInt();
	
	total = price - amount;
	
	int numofQuarter = total /25;
		total -= numofQuarter * 25;
	System.out.println("the number of quaters " + numofQuarter);
	
	int numofDimes = total /10;
	total -= numofDimes *10;
	System.out.println("the number of dimes" + numofDimes);
	
	int numofNickels = total /5;
	total -=numofNickels *5;
	System.out.println("the number of nickels" + numofNickels);
	
	int numofPennies = total /1;
			total -=numofPennies *1;
			System.out.println("the number of pennies" + numofPennies);
	
	
	
	
	

	
	//int totalCents = 25*quarters + 10*dimes + 5*nickels + pennies;
	//dollars = totalCents/100.0;
	
}
}
