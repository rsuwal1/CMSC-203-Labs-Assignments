import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		Movie a = new Movie();

			String title, rating;
			int tickets;
			String response;
			
		do {
			System.out.print("Enter the name of the movie: ");
			title = userInput.nextLine();
			a.setTitle(title);
				
			System.out.print("Enter the rating of the movie: ");
			rating = userInput.nextLine();
			a.setRating(rating);
				
			System.out.print("Enter the number of tickets sold for this movie: ");
			tickets = userInput.nextInt();
			a.setSoldTickets(tickets);
				
			System.out.println(a.toString());
				
			System.out.print("\nDo you want to enter another movie? (Y or N): ");
			response = userInput.next();
			
			userInput.nextLine();
			
		   }while(response.equals("y"));
		
		userInput.close();

	}

}
