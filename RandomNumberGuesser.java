/*
 * Class: CMSC203 46519
 * Instructor:Farnaz Eivazi
 * Description: (Give a brief description for each Class)
 * Due: 6/30/2022
 * Platform/compiler:
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here:vhuhwavho Todani
   @author Vhuhwavho Todani
*/
import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuesser {
	 public static void main(String[] args) {
		 //Constant string for programmer name
		 final String programmerName="Vhuhwavho Todani";
		 int highGuess=100;
		 int lowGuess=0;
		 int nextGuess;
		 int randNum;
		 int finalCount=0;
		 String choice="yes";
		 boolean test=false;
		 //create rng object which makes use of the rng.java file
		 RNG randm=new RNG(); 
		 RNG.resetCount();
		 Scanner keyboard = new Scanner (System.in);
		 while(choice.equals("yes")) {
	     //randomize a number from 1 to 100 to be compared to
		 randNum=RNG.rand();
		 System.out.println("Enter your first guess");	  
		 nextGuess=keyboard.nextInt();
		 //while loop allows to loop until a 
		 while (test==false) {
        
         
         //call input validation method to check if guess is within appropriate range, loops until a valid input is entered
         while(RNG.inputValidation(nextGuess, lowGuess, highGuess)==false) {
        	 nextGuess=keyboard.nextInt();
        	 finalCount++;
         }
         //variable finalcount will correct if inputvalidation causes the count to go over the value if incorrect input is entered multiple times
         finalCount=RNG.getCount()-finalCount;
         System.out.println("number of guesses is "+finalCount);
         finalCount=0;
         //test if the guess is lower, higher or the correct guess
         if(nextGuess>randNum) {
        	 System.out.println("Your guess is too high");
        	 highGuess=nextGuess;
         }
         else if(nextGuess<randNum) {
        	 System.out.println("Your guess is too low");	
        	 lowGuess=nextGuess;
         }
         //if guess is not equal, print the range of the next input
         if(nextGuess==randNum) {
        	 System.out.println("Congratulations, you guessed correctly");
        	 test=true;
         }
         else {
         System.out.println("Enter your next guess between "+lowGuess+ " and "+highGuess); 
         nextGuess=keyboard.nextInt();
         }
		 }
		 //reset count of guesses made in case user chooses to run program again
         RNG.resetCount();
         //reset values for guess range and test case for following run
         highGuess=100;
		 lowGuess=0;
		
		 test=false;
         System.out.println("Try again? (yes or no)");
         keyboard.nextLine();
         choice=keyboard.nextLine();
         
		 }
         //close scanner as there is no more input
		   keyboard.close();
		   System.out.println("Thanks for playing!");
		 //print programmer name
		   System.out.println("\nProgrammer name: "+programmerName);
	 }
	 
}
