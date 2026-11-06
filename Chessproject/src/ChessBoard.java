public class ChessBoard {
    private ChessPiece[][] board;

    public ChessBoard() {
        resetBoard();
    }

    public void printBoard() {
        // Top line of board
        System.out.println("+----+----+----+----+----+----+----+----+");

        // For every row
        for (int i = 7; i >= 0; i--) {
            System.out.println("|    |    |    |    |    |    |    |    |");
            // For every column
            for (int j = 0; j < board[i].length; j++) {
                ChessPiece piece = board[i][j];
                if (piece != null) {
                    System.out.print("| " + piece.getTeam().getSymbol() + piece.getType().getSymbol() + " ");
                } else {
                    System.out.print("|    ");
                }
            }
            // Add last pipe of the line and move to next line
            System.out.println("|");

            // Finish off row bottom
            System.out.println("|    |    |    |    |    |    |    |    |");
            System.out.println("+----+----+----+----+----+----+----+----+");
        }
    }

    public void resetBoard() {
        // Make the chess board a fresh game
        board = new ChessPiece[][]{
            {new ChessPiece(new int[]{0, 0}, Team.WHITE, PieceType.ROOK),
             new ChessPiece(new int[]{0, 1}, Team.WHITE, PieceType.KNIGHT),
             new ChessPiece(new int[]{0, 2}, Team.WHITE, PieceType.BISHOP),
             new ChessPiece(new int[]{0, 3}, Team.WHITE, PieceType.QUEEN),
             new ChessPiece(new int[]{0, 4}, Team.WHITE, PieceType.KING),
             new ChessPiece(new int[]{0, 5}, Team.WHITE, PieceType.BISHOP),
             new ChessPiece(new int[]{0, 6}, Team.WHITE, PieceType.KNIGHT),
             new ChessPiece(new int[]{0, 7}, Team.WHITE, PieceType.ROOK)},
            {new ChessPiece(new int[]{1, 0}, Team.WHITE, PieceType.PAWN),
             new ChessPiece(new int[]{1, 1}, Team.WHITE, PieceType.PAWN),
             new ChessPiece(new int[]{1, 2}, Team.WHITE, PieceType.PAWN),
             new ChessPiece(new int[]{1, 3}, Team.WHITE, PieceType.PAWN),
             new ChessPiece(new int[]{1, 4}, Team.WHITE, PieceType.PAWN),
             new ChessPiece(new int[]{1, 5}, Team.WHITE, PieceType.PAWN),
             new ChessPiece(new int[]{1, 6}, Team.WHITE, PieceType.PAWN),
             new ChessPiece(new int[]{1, 7}, Team.WHITE, PieceType.PAWN)},
            {null,null,null,null,null,null,null,null},
            {null,null,null,null,null,null,null,null},
            {null,null,null,null,null,null,null,null},
            {null,null,null,null,null,null,null,null},
            {new ChessPiece(new int[]{6, 0}, Team.BLACK, PieceType.PAWN),
             new ChessPiece(new int[]{6, 1}, Team.BLACK, PieceType.PAWN),
             new ChessPiece(new int[]{6, 2}, Team.BLACK, PieceType.PAWN),
             new ChessPiece(new int[]{6, 3}, Team.BLACK, PieceType.PAWN),
             new ChessPiece(new int[]{6, 4}, Team.BLACK, PieceType.PAWN),
             new ChessPiece(new int[]{6, 5}, Team.BLACK, PieceType.PAWN),
             new ChessPiece(new int[]{6, 6}, Team.BLACK, PieceType.PAWN),
             new ChessPiece(new int[]{6, 7}, Team.BLACK, PieceType.PAWN)},
            {new ChessPiece(new int[]{7, 0}, Team.BLACK, PieceType.ROOK),
             new ChessPiece(new int[]{7, 1}, Team.BLACK, PieceType.KNIGHT),
             new ChessPiece(new int[]{7, 2}, Team.BLACK, PieceType.BISHOP),
             new ChessPiece(new int[]{7, 3}, Team.BLACK, PieceType.QUEEN),
             new ChessPiece(new int[]{7, 4}, Team.BLACK, PieceType.KING),
             new ChessPiece(new int[]{7, 5}, Team.BLACK, PieceType.BISHOP),
             new ChessPiece(new int[]{7, 6}, Team.BLACK, PieceType.KNIGHT),
             new ChessPiece(new int[]{7, 7}, Team.BLACK, PieceType.ROOK)}
        };
    }
}
