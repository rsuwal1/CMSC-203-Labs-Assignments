import java.util.Scanner;

public class Windchill {

	public static void main(String[] args) {
		
		System.out.println("Windchill Calculator");
		System.out.println(" ");
		
		double t,v,w;
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter Temperature in fahrenheit(from -45 to 40): ");
		t = userInput.nextDouble();
		
		System.out.print("Enter Wind speed in mph(from 5 to 60): ");
		v = userInput.nextDouble();
		
		w = 35.74 + (0.6215 * t) - (35.75 * Math.pow(v, 0.16)) + (0.4275 * t) * Math.pow(v, 0.16);
		System.out.println();
		
		userInput.close();
		
		System.out.print("Windchill Temperature: ");
		System.out.println(w);
		
		System.out.println("Programmer Name: Rabindra Raj Suwal");
		
	}

}
