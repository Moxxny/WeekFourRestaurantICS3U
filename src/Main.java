import java.nio.file.FileSystem;
import java.util.*;
/*******************************
 * Name: Your name
 * Class: ICS3U
 * Date: Friday Sept. 25
 * Project Name: Restaurant
 * 
 * You will have your first real project this week. You must meet all of the following criteria:
Create a restaurant of your choosing
Print menu items one at a time, including the price.
Ask how many of each item they would like to purchase
Must have at least 5 different menu items
Calculate the total price
If the total is more than $30, take off 10%.
If the total is more than $50, take off 20%.
Add 13% HST  to the total
Print out the initial price, any discounts, taxes, and the grand total.
Read in a payment amount from the user
Calculate the change
If the change is negative, state that they still owe you money.
This is to be done individually.
DO NOT use AI! 
Feel free to use previous notes, videos, and online resources like w3schools.com
Fork the repository, add me (MrZebarth) as a collaborator, clone the repository to your computer, program your solution, and then commit and push the results.
 ********************************/
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Mo's Restaurant");
		System.out.println("Here is our menu");
		System.out.println("1. Burger - $12");
		System.out.println("1. Pizza - $15");
		System.out.println("3. Fries - $5");
		System.out.println("4. Chicken wings - $10");
		System.out.println("5. Soda - $3");

		System.out.println("How many burgers would you like?");
		int burgers = input.nextInt();

		System.out.println("How many pizzas would you like?");
		int pizzas = input.nextInt();

		System.out.println("How many fries would you like");
		int fries = input.nextInt();

		System.out.println("How many chicken wings would you like");
		int wings = input.nextInt();

		System.out.println("How many sodas would you like");
		int sodas = input.nextInt();

		double total = (burgers * 12) + (pizzas * 15) + (fries * 5) + (wings * 10) + (sodas * 3);
		System.out.println("Your initial price is $" + total);

		double discount = 0;

		if (total > 50) {
			discount = total * 0.20;
			System.out.println("You got a 20% discount.");
		} else if (total > 30) {
			discount = total * 0.10;
			System.out.println("You got a 10% discount.");
		}

		double afterDiscount = total - discount;
		double tax = afterDiscount * 0.13;
		double finalTotal = afterDiscount + tax;

		System.out.println("Discount: $" + discount);
		System.out.println("HST: $" + tax);
		System.out.println("GrandTotal: $" + finalTotal);

		System.out.println("how much are you paying?");
		Double payment = input.nextDouble();

		double change = payment - finalTotal;

		if (change < 0) {
			System.out.println("You still owe $" + (-change));
		} else {
			System.out.println("Your change is $" + change);
		}

		System.out.println("thank you for coming to Mo's restaurant");

	}

}
