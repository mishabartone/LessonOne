package HomeWork9;

public class Robot implements Skills {

    private String name;
    private int canJump;
    private int canRun;

    public Robot(String name, int canJump, int canRun) {
        this.name = name;
        this.canJump = canJump;
        this.canRun = canRun;
    }

    @Override
    public boolean run(Treadmill treadmill) {
        if (this.canRun >= treadmill.getLength()){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean jump(Wall wall) {
        if (this.canJump >= wall.getHeight()){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getName() {
        return name;
    }
}
