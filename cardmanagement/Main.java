package com.gmail.murmeldjur;

import java.util.Scanner;
/**
* The Card and Deck program implements a program which
* creates a deck of 52 cards. Shuffles it and make you able 
* to sort the deck either by color or rank. 
* The program also has methods to print out the deck 
* to the standard output.
*
* @author  Ola Karlsson
* @version 1.0
* @since   2016-10-24 
*/

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int svar;

	public static void main(String[] args) {
		setUI();
	}

	/**
	 * This function displays the menu to the console window
	 */
	public static void setUI() {
		while (true) {
			System.out.println("Deck Management");
			System.out.println("-----------------------");
			System.out.println("0\tCreate Deck");
			System.out.println("1\tShuffle Deck");
			System.out.println("2\tPrint Deck");
			System.out.println("3\tSort Deck by Rank");
			System.out.println("4\tSort Deck by Suite");
			System.out.println("5\tExit");

			System.out.println("");
			System.out.print("Välj: ");
			svar = sc.nextInt();

			switch (svar) {
			case 0:
				CardHolder.createDeck();
				System.out.println("A deck have been created!");
				break;
			case 1:
				CardHolder.shuffleDeck();
				System.out.println("The deck have been shuffled!");
				break;
			case 2:
				CardHolder.printDeck();
				System.out.println(" ");
				break;
			case 3:
				CardHolder.sortDeck(false, true);
				System.out.println("Deck is sorted by rank");
				break;
			case 4:
				CardHolder.sortDeck(true, false);
				System.out.println("Deck is sorted by suite");
				break;
			case 5:
				System.out.println("Program exited!!");
				System.exit(0);
				break;
			default:
				System.out.println("Unknown variable!!");
				System.exit(0);
				break;
			}
		}
	}
}
