package com.alper.commons.model;

public class DaubResponse extends Response {
	private boolean winner = false;
	
	public DaubResponse(boolean success, boolean winner) {
		super(success);
		this.winner = winner;
	}

	public boolean isWinner() {
		return winner;
	}

	public void setWinner(boolean winner) {
		this.winner = winner;
	}
	
}
