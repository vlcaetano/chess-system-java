package boardgame;

public abstract class Piece {

	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; // apenas didatico, o position sem ser declarado ja tem o valor null
	}

	protected Board getBoard() { // protected para somente as subclasses terem acesso a esse metodo
		return board;
	}
	
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean mat[][] = possibleMoves();
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) { // mat.lenght pq podemos presumir que a matriz eh quadrada
				if (mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
}
