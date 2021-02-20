package Lectures.Lec10;

public class Home {

    private int floor;
    private int size;
    private int price;

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Home(int floor, int size, int price) {
        this.floor = floor;
        this.size = size;
        this.price = price;
    }
}
