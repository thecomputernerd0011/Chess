public class GameSetup {
    public class ChessBoard {
        private int[] xCoords = {};
        private int[] yCoords = {};
        char[][] graph = new char[8][8]; // 8 rows (y), 8 columns (x)

        {
            for (int i = 0; i < xCoords.length; i++) {
                int row = graph.length - 1 - yCoords[i]; // invert y for screen coords
                int col = xCoords[i] + 1;
                graph[row][col] = 'X';
            }
        }
    }




























        
    public static int getWhitepawnonePosition() {
        return WhitePieces.WhitepawnonePosition;
    }

    public static int getWhitepawntwoPosition() {
        return WhitePieces.WhitepawntwoPosition;
    }

    public static int getWhitepawnthreePosition() {
        return WhitePieces.WhitepawnthreePosition;
    }

    public static int getWhitepawnfourPosition() {
        return WhitePieces.WhitepawnfourPosition;
    }

    public static int getWhitepawnfivePosition() {
        return WhitePieces.WhitepawnfivePosition;
    }

    public static int getWhitepawnsixPosition() {
        return WhitePieces.WhitepawnsixPosition;
    }

    public static int getWhitepawnsevenPosition() {
        return WhitePieces.WhitepawnsevenPosition;
    }

    public static int getWhitepawneightPosition() {
        return WhitePieces.WhitepawneightPosition;
    }

}


