package ca.nl.cna.java2.collections;

/**
 * Fun class for "fake" shapes
 *
 * //TODO handle invalid side values
 */
public class Square {

    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int area(){
        return this.side * this.side;
    }

    public String getDescription(){
        return "ca.nl.cna.java2.collections.Square with side length " + side + " and area " + this.area();
    }

}
