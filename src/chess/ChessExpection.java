package chess;

import boardgame.BoardException;

public class ChessExpection extends BoardException {

	private static final long serialVersionUID = 1L;
	
	public ChessExpection(String msg) {
		super(msg);
	}
}
