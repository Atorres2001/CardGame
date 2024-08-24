package CardGame;

public enum Suit {
    HEARTS("hearts"),
    DIAMONDS("diamonds"),
    SPADES("spades"),
    CLUBS("clubs");

    private final String name;

    Suit(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
