package activities;

public class Activity1 {
    public static void main(String[] args){
        Car altroz = new Car();
        altroz.make = 2014;
        altroz.color = "Black";
        altroz.transmission = "Manual";
        altroz.displayCharacteristics();
        altroz.accelerate();
        altroz.brake();

    }
}
