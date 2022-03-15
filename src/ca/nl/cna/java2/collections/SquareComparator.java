package ca.nl.cna.java2.collections;

import java.util.Comparator;


/**
 * Compare two squares. A square is larger than another square if it has a larger area
 * (Note: this means it also has a larger size)
 */
public class SquareComparator implements Comparator<Square> {

    @Override
    public int compare(Square o1, Square o2) {
        return o1.getSide() - o2.getSide();
    }
}
