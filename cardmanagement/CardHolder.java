package com.gmail.murmeldjur;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CardHolder {
	static List<Card> cardDeck = new ArrayList<>();

	/**
	 * Creates a deck
	 */
	public static void createDeck() {
		for (Suite suit : Suite.values()) {
			for (Rank rank : Rank.values()) {
				cardDeck.add(new Card(rank, suit));
			}
		}
	}

	/**
	 * Prints the deck to console
	 */
	public static void printDeck() {
		for (Card p : cardDeck) {
			System.out.println(p);
		}
	}

	/**
	 * Shuffles the deck by using Math.random() method
	 */

	public static void shuffleDeck() {
		Card temp;
		for (int i = 0; i <= 51; i++) {
			int pos = (int) (Math.random() * 52);
			temp = cardDeck.get(i);
			cardDeck.set(i, cardDeck.get(pos));
			cardDeck.set(pos, temp);
		}
	}

	/**
	 * Sorts deck using Comparator method
	 * 
	 * @param sortByColor
	 *            Choose to sort by color
	 * @param sortByRank
	 *            Choose to sort by rank
	 */
	public static void sortDeck(boolean sortByColor, boolean sortByRank) {
		Collections.sort(cardDeck, new Comparator<Card>() {
			@Override
			public int compare(Card c1, Card c2) {
				if (sortByColor) {
					int temp = c1.getSuit().compareTo(c2.getSuit());
					if (temp == 0)
						temp = c1.getRank().compareTo(c2.getRank());
					return temp;
				} else {
					int temp = c1.getRank().compareTo(c2.getRank());
					if (temp == 0)
						temp = c1.getSuit().compareTo(c2.getSuit());
					return temp;
				}
			}
		});
	}
}
