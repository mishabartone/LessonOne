package Lectures.SixLec.service;


import Lectures.SixLec.model.Motor;
import Lectures.SixLec.model.AbstractCar;

public class MotorService {

    private Motor motor;
    private boolean isStarted;

    public MotorService(Motor motor) {
        this.motor = motor;
    }

    public boolean isStarted() {
        return isStarted;
    }

    public void drive(boolean start){
        if (!start) {
            System.out.println("You cant drive");
            return;
        }

        this.isStarted = start;
        motor.isStarted(start);
    }

    public void stop(boolean stop){
        if (!stop) {
            System.out.println("You cant drive");
            return;
        }

        this.isStarted = stop;
        motor.isStarted(stop);
    }
}