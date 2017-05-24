import java.util.Scanner;
import java.util.Calendar;

public class ageCalculator{

public static void main(String[] args){

int userYear = 0;
int userDay = 0;
int userMonth = 0;
int userAge = 0;
Calendar today = Calendar.getInstance();
String  userChoice = "";

do{
	System.out.println("Enter Year of Birth");
	Scanner yearScanner = new Scanner(System.in);
	userYear = yearScanner.nextInt();

	System.out.println("Enter Month of Birth");
	Scanner monthScanner = new Scanner(System.in);
	userMonth = monthScanner.nextInt();

	System.out.println("Enter Day of Birth");
	Scanner dayScanner = new Scanner(System.in);
	userDay = dayScanner.nextInt();

	//System.out.println(currentDate);
	
	System.out.println("Would you like to enter details about another client?");
	Scanner choiceScanner = new Scanner(System.in);
	userChoice = choiceScanner.next();

}while(userChoice == "Y");

System.out.println("Thanks for using the Age Calculator!");

}

}
