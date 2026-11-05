public class GameSetup {
    public static class MakeChessBoard {
        static String[][] Chessboard = new String[8][8];
        public static void chessboard() {
            for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                System.out.print("+---");
            }
            System.out.println("+");

            for (int col = 0; col < 8; col++) {
                System.out.print("|   ");
            }
            System.out.println("|");
            }
            for (int col = 0; col < 8; col++) {
                System.out.print("+---");
            }
            System.out.println("+");
            
            };
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


