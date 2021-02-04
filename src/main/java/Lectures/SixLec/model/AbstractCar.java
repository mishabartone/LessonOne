package Lectures.SixLec.model;

import Lectures.SixLec.service.MotorService;

public abstract class AbstractCar {

    private final Motor motor;
    private final Wheel[] wheels;
    private final CarBody carBody;

    public AbstractCar(Motor motor, Wheel[] wheels, CarBody carBody) {
        this.motor = motor;
        this.wheels = wheels;
        this.carBody = carBody;
    }

    public boolean isStarted(MotorService motorservice){
        return motorservice.isStarted();
    }

    public Motor getMotor() {
        return motor;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public CarBody getCarBody() {
        return carBody;
    }

}
