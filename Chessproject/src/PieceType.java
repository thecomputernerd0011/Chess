public enum PieceType {
    PAWN,
    ROOK,
    KNIGHT,
    BISHOP,
    QUEEN,
    KING;

    public char getSymbol() {
        switch (this) {
            case PAWN:
                return 'P';
            case ROOK:
                return 'R';
            case KNIGHT:
                return 'N';
            case BISHOP:
                return 'B';
            case QUEEN:
                return 'Q';
            case KING:
                return 'K';
            default:
                throw new IllegalArgumentException("Unknown piece type: " + this);
        }
    }
}