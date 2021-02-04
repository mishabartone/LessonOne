package Lectures.SixLec.model;

public class Motor {
    private int power;
    private double volume;
    private boolean isTurbo;

    public Motor(int power, double volume, boolean isTurbo) {
        this.power = power;
        this.volume = volume;
        this.isTurbo = isTurbo;
    }

    public boolean isStarted(boolean action){
        return action;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public boolean isTurbo() {
        return isTurbo;
    }

    public void setTurbo(boolean turbo) {
        isTurbo = turbo;
    }
}
