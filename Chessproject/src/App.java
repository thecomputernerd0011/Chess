import java.util.*;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        /*System.out.println("White pawn one position: " + WhitePieces.getWhitepawnonePosition());
        System.out.println("White pawn two position: " + WhitePieces.getWhitepawntwoPosition());
        System.out.println("White pawn three position: " + WhitePieces.getWhitepawnthreePosition());
        System.out.println("White pawn four position: " + WhitePieces.getWhitepawnfourPosition());
        System.out.println("White pawn five position: " + WhitePieces.getWhitepawnfivePosition());
        System.out.println("White pawn six position: " + WhitePieces.getWhitepawnsixPosition());
        System.out.println("White pawn seven position: " + WhitePieces.getWhitepawnsevenPosition());
        System.out.println("White pawn eight position: " + WhitePieces.getWhitepawneightPosition());*/
        ChessBoard chessBoard = new ChessBoard();
        chessBoard.printBoard();
        GamePlay.Player_turn();
    }
}
