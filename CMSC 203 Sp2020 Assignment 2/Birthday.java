package _solution;

import javax.swing.JOptionPane;
import java.text.NumberFormat;
import java.util.Random;

public class Birthday {

	public static void main(String[] args) {
		
		Toy toy = new Toy();
		NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
		Random rand = new Random();
		
		String name, age, toy1, confirmToy, card, balloon, anotherGift;
		double total = 0.00;
		boolean ageOkay;
		
		JOptionPane.showMessageDialog(null, "Welcome to the Toy Company\nPress OK to Continue");
		System.out.println("BIRTHDAY GIFTS\n");
		
		do {
			do {
				confirmToy = "no";
				
				name = JOptionPane.showInputDialog("Enter Child's Name:");
				
				age = (JOptionPane.showInputDialog("Enter " + name +"'s Age:"));
				toy.setAge(Integer.parseInt(age));
				
				toy1 = (JOptionPane.showInputDialog("Select a toy for " +name +":\n# Plushie\n# Book\n# Blocks"));
				toy.setToy(toy1);
						
				ageOkay = toy.ageOK();
				if(ageOkay == false)
				{
					confirmToy = JOptionPane.showInputDialog("This toy is not appropriate for " +name +"'s age.\nDo you want to cancel this toy?\nYes or No");
				}
				
			}while(confirmToy.equalsIgnoreCase("yes"));
					
			toy.setCost(toy1);
			
			card = JOptionPane.showInputDialog("Do you want to add a card to the gift?\nYes or No");
			toy.addCard(card);
			
			balloon = JOptionPane.showInputDialog("Do you want to add a balloon to the gift?\nYes or No");
			toy.addBalloon(balloon);
			
			System.out.println("The gift for " +name +" at"+toy.toString());
			
			total += toy.getCost();
			
			anotherGift = JOptionPane.showInputDialog("Do you want to add another gift?\nYes or No");			
		}while (anotherGift.equalsIgnoreCase("yes"));
		
		System.out.println("\nYour Total Cost is " + fmt1.format(total));
		System.out.println("Your order number is " + rand.nextInt(100000));
		
		System.out.println("\nProgrammer Name: Rabindra Raj Suwal");
	}

}
