import java.util.Scanner;

public class MovieDriver {
	public static void main(String[] args) {
		String choice;
		Scanner keyboard = new Scanner (System.in);
		int count=0;
		 Movie firstMovie=new Movie();
		 do{
		 System.out.println("Enter the name of the movie");	  
		 firstMovie.setTitle(keyboard.nextLine());
		 System.out.println("Enter the rating of the movie");
		 firstMovie.setRating(keyboard.nextLine());		  
		 System.out.println("Enter the number of tickets sold for this movie");
		 firstMovie.setSoldTickets(keyboard.nextInt());
		 System.out.println(firstMovie.toString());
		 System.out.println("Do you want to enter another? (y or n)");
		 keyboard.nextLine();
		 choice=keyboard.nextLine();
		 if (!choice.equals("y")) {
			 count++;
		 }
		 }while(count==0); 
		 
		 System.out.print("Goodbye");
	}
	
}
