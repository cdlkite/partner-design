package org.cdl.partner.adapter;

/**
 * 圆钉 标准类、不能被改变
 */
public class RoundPeg {
    /**
     * 半径
     */
    private double radius;

    public RoundPeg(double radius) {
        this.radius = radius;
    }

    public RoundPeg() {

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
