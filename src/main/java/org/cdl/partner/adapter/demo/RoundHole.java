package org.cdl.partner.adapter.demo;

/**
 * 圆孔 标准类、不能被改变
 */
public class RoundHole {

    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public boolean isFit(RoundPeg roundPeg) {
        return this.radius >= roundPeg.getRadius();
    }

}
