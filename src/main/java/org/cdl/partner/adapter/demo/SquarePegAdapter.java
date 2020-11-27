package org.cdl.partner.adapter;

/**
 * 让方顶适配成圆钉，以便能钉入圆孔
 */
public class SquarePegAdapter extends RoundPeg {

    private SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        super();
        this.squarePeg = squarePeg;
    }

    @Override
    public double getRadius() {
        double width = this.squarePeg.getWidth();
        double radius = (Math.sqrt(Math.pow((width / 2), 2) * 2));
        return radius;
    }
}
