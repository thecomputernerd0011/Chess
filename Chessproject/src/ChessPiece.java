public class ChessPiece {
    private int[] position;
    private Team team;
    private PieceType type;

    public ChessPiece(int[] position, Team team, PieceType type) {
        this.position = position;
        this.team = team;
        this.type = type;
    }
}
