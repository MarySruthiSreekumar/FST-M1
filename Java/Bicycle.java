package activities;

public class Bicycle implements BicycleParts, BicycleOperations{
    int  gears;
    int currentSpeed;
    public Bicycle(){
        gears = 2;
        currentSpeed = 50;

    }

    @Override
    public void applyBrake(int decrement) {
        currentSpeed = currentSpeed - decrement;
    }

    @Override
    public void speedUp(int increment) {
        currentSpeed = currentSpeed + increment;

    }
    public String bicycleDesc() {
        return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed);
    }



}
