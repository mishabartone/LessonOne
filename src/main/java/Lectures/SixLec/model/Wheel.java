package Lectures.SixLec.model;

public class Wheel {
    private double width;
    private double radius;
    private boolean isSummer;

    public Wheel(double width, double radius, boolean isSummer) {
        this.width = width;
        this.radius = radius;
        this.isSummer = isSummer;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public boolean isSummer() {
        return isSummer;
    }

    public void setSummer(boolean summer) {
        isSummer = summer;
    }
}