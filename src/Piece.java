public abstract class Piece {

    // Name of the pieces
    private String name;

    // Constructor
    public Piece(String name) {
        this.name = name;
    }

    // validates moves
    public boolean validateMove(){
        return true;
    }

    // returns object name
    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
