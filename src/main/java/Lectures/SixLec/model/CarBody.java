package Lectures.SixLec.model;

public class CarBody {
    private String color;
    private int doorCount;
    private final String bodyType;

    public CarBody(String color, int doorCount, String bodyType) {
        this.color = color;
        this.doorCount = doorCount;
        this.bodyType = bodyType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }

    public String getBodyType() {
        return bodyType;
    }

}
