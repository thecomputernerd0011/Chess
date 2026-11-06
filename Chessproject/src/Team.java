public enum Team {
    WHITE,
    BLACK;

    public char getSymbol() {
        switch (this) {
            case WHITE:
                return 'W';
            case BLACK:
                return 'B';
            default:
                throw new IllegalArgumentException("Unknown team: " + this);
        }
    }
}
