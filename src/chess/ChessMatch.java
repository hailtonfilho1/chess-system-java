package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch { // regras de xadrez
	
	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8); // regra um: tabuleiro com 8 linhas e 8 colunas
		initialSetup();
	}
	
	public ChessPiece[][] getPieces() { // retorna matriz de peças de xadrez correspondente a partida
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
	
	private void initialSetup() {
		board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
		board.placePiece(new King(board, Color.BLACK), new Position(0, 4));
		board.placePiece(new King(board, Color.BLACK), new Position(7, 4));
	}

}
