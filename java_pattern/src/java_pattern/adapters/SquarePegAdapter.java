package java_pattern.adapters;

import java_pattern.round.RoundPeg;
import java_pattern.square.SquarePeg;

/**
 * Adapter allows fitting square pegs into round holes.
 */
public class SquarePegAdapter extends RoundPeg {
    private SquarePeg abc;

    public SquarePegAdapter(SquarePeg abc) {
        this.abc = abc;
    }

    @Override
    public double getRadius() {
        double result;
        // Calculate a minimum circle radius, which can fit this peg.
        result = (Math.sqrt(Math.pow((abc.getWidth() / 2), 2) * 2));
        return result;
    }
}