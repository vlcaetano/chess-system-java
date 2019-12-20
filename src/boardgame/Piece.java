package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; // apenas didatico, o position sem ser declarado ja tem o valor null
	}

	protected Board getBoard() { // protected para somente as subclasses terem acesso a esse metodo
		return board;
	}
	
	
}
