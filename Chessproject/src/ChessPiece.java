public class ChessPiece {
    private int[] position;
    private Team team;
    private PieceType type;

    public ChessPiece(int[] position, Team team, PieceType type) {
        this.position = position;
        this.team = team;
        this.type = type;
    }

    public int[] getPosition() {
        return position;
    }

    public Team getTeam() {
        return team;
    }

    public PieceType getType() {
        return type;
    }

    public void setPosition(int[] position) {
        this.position = position;
    }
}
