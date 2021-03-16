package HomeWork17;

import java.util.ArrayList;

public class Box<T extends Fruit> implements Comparable<Box<T>> {

    private ArrayList<T> boxList = new ArrayList<T>();

    public ArrayList<T> getBoxList() {
        return boxList;
    }

    public float getWeight(){
        float totalWeight = 0;
        for (Fruit fr : this.boxList) {
            if (fr instanceof Apple){
                totalWeight += 1.0f;
            } else if (fr instanceof Orange){
                totalWeight += 1.5f;
            }
        }
        return totalWeight;
    }

    public void addFruit(T fruit){
        if ((boxList.size() > 0 && boxList.get(0) instanceof Apple && fruit instanceof Apple) ||
                (boxList.size() > 0 && boxList.get(0) instanceof Orange && fruit instanceof Orange) ||
                    boxList.size() == 0){

            boxList.add(fruit);
        }
    }

    public void changeBox(ArrayList<T> box1, ArrayList<T> box2) {
        if (box1.size() == 0) {
            // theres nothing to change
            return;
        }

        if (!(box2.size() == 0)){
            if ((box2.get(0) instanceof Apple && box1.get(0) instanceof Apple) ||
                (box2.get(0) instanceof Orange && box1.get(0) instanceof Orange)){
                box2.addAll(box1);
                box1 = new ArrayList<T>();
            }
        } else {
            box2 = box1;
            box1 = new ArrayList<T>();
        }
    }

    @Override
    public int compareTo(Box<T> o) {
        return (int) (this.getWeight() - o.getWeight());
    }

    public boolean compare(Box<T> o){
        return this.getWeight() == o.getWeight();
    }
}
