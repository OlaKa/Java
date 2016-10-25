package com.gmail.murmeldjur;

public class Card {

	private final Rank rank;
	private final Suite suit;

	public Card(Rank rank, Suite suite) {
		this.rank = rank;
		this.suit = suite;
	}

	public Suite getSuit() {
		return suit;
	}

	public Rank getRank() {
		return rank;
	}

	/**
	 * @category Overrides toString method
	 */
	@Override
	public String toString() {
		return suit + " " + rank;
	}
}
