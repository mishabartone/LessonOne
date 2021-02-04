package HomeWork7.Stuff;

public class Plate {

    private int food = 0;

    public Plate(int food) {
        this.food = food;
    }

    public void addFood(int newFood){
        this.food += newFood;
    }

    public boolean tryToEat(int useFood){
        if (this.food - useFood >= 0){
            this.food -= useFood;
            return true;
        } else {
            return false;
        }
    }

    public int getFood() {
        return food;
    }
}
