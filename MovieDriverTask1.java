import java.util.Scanner;

public class MovieDriverTask1 {
	public static void main(String[] args) {
		 Scanner keyboard = new Scanner (System.in);
		 Movie firstMovie=new Movie(); 
		 System.out.println("Enter the name of the movie");	  
		 firstMovie.setTitle(keyboard.nextLine());
		 System.out.println("Enter the rating of the movie");
		 firstMovie.setRating(keyboard.nextLine());		  
		 System.out.println("Enter the number of tickets sold for this movie");
		 firstMovie.setSoldTickets(keyboard.nextInt());
		 System.out.println(firstMovie.toString());		 	 
		 System.out.print("Goodbye");
	}
	
}
