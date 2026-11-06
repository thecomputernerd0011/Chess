import java.util.Scanner;
import java.util.Arrays;

public class GamePlay {
    public static class Movement {
        public static void moveWhitePawnOne() {
            WhitePieces.WhitepawnonePosition[0] = WhitePieces.WhitepawnonePosition[0] + 1;
            WhitePieces.WhitepawnonePosition[1] = WhitePieces.WhitepawnonePosition[1] + 0;
            System.out.println("White pawn one new position: " + Arrays.toString(WhitePieces.WhitepawnonePosition));
        }
        public static void moveWhitePawnTwo() {
            WhitePieces.WhitepawntwoPosition[0] = WhitePieces.WhitepawntwoPosition[0] + 1;
            WhitePieces.WhitepawntwoPosition[1] = WhitePieces.WhitepawntwoPosition[1] + 0;
            System.out.println("White pawn two new position: " + Arrays.toString(WhitePieces.WhitepawntwoPosition));
        }
            public static void moveWhitePawnThree() {
            WhitePieces.WhitepawnthreePosition[0] = WhitePieces.WhitepawnthreePosition[0] + 1;
            WhitePieces.WhitepawnthreePosition[1] = WhitePieces.WhitepawnthreePosition[1] + 0;
            System.out.println("White pawn three new position: " + Arrays.toString(WhitePieces.WhitepawnthreePosition));
        }
            public static void moveWhitePawnFour() {
            WhitePieces.WhitepawnfourPosition[0] = WhitePieces.WhitepawnfourPosition[0] + 1;
            WhitePieces.WhitepawnfourPosition[1] = WhitePieces.WhitepawnfourPosition[1] + 0;
            System.out.println("White pawn four new position: " + Arrays.toString(WhitePieces.WhitepawnfourPosition));
            }
            public static void moveWhitePawnFive() {
            WhitePieces.WhitepawnfivePosition[0] = WhitePieces.WhitepawnfivePosition[0] + 1;
            WhitePieces.WhitepawnfivePosition[1] = WhitePieces.WhitepawnfivePosition[1] + 0;
            System.out.println("White pawn five new position: " + Arrays.toString(WhitePieces.WhitepawnfivePosition));
            }
            public static void moveWhitePawnSix() {
            WhitePieces.WhitepawnsixPosition[0] = WhitePieces.WhitepawnsixPosition[0] + 1;
            WhitePieces.WhitepawnsixPosition[1] = WhitePieces.WhitepawnsixPosition[1] + 0;
            System.out.println("White pawn six new position: " + Arrays.toString(WhitePieces.WhitepawnsixPosition));
        }
        public static void moveWhitePawnSeven() {
            WhitePieces.WhitepawnsevenPosition[0] = WhitePieces.WhitepawnsevenPosition[0] + 1;
            WhitePieces.WhitepawnsevenPosition[1] = WhitePieces.WhitepawnsevenPosition[1] + 0;
            System.out.println("White pawn seven new position: " + Arrays.toString(WhitePieces.WhitepawnsevenPosition));
        }
        public static void moveWhitePawnEight() {
            WhitePieces.WhitepawneightPosition[0] = WhitePieces.WhitepawneightPosition[0] + 1;
            WhitePieces.WhitepawneightPosition[1] = WhitePieces.WhitepawneightPosition[1] + 0;
            System.out.println("White pawn eight new position: " + Arrays.toString(WhitePieces.WhitepawneightPosition));
        }
        public static void moveWhiteRookOne() {
            WhitePieces.WhiteRookonePosition[0] = WhitePieces.WhiteRookonePosition[0] + 1;
            WhitePieces.WhiteRookonePosition[1] = WhitePieces.WhiteRookonePosition[1] + 0;
            System.out.println("White Rook one new position: " + Arrays.toString(WhitePieces.WhiteRookonePosition));
        }   }
    public static void Player_turn() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the piece you want to move: ");
        String piece = scanner.nextLine();
       if (piece.equals("White pawn one")) {
             Movement.moveWhitePawnOne();
        } else if (piece.equals("White pawn two")) {
            Movement.moveWhitePawnTwo();
        } else if (piece.equals("White pawn three")) {
            Movement.moveWhitePawnThree();
        } else if (piece.equals("White pawn four")) {
            Movement.moveWhitePawnFour();
        } else if (piece.equals("White pawn five")) {
            Movement.moveWhitePawnFive();
        } else if (piece.equals("White pawn six")) {
            Movement.moveWhitePawnSix();
        } else if (piece.equals("White pawn seven")) {
            Movement.moveWhitePawnSeven();
        } else if (piece.equals("White pawn eight")) {
            Movement.moveWhitePawnEight();
        } else if (piece.equals("White Rook one")) {
            Movement.moveWhiteRookOne();
        }
    }
}
