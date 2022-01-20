package activities;

public class MountainBike extends  Bicycle{
    int seatHeight;
    public MountainBike(int gears,int currentSpeed,int seatHeight){
        super.gears = gears ;
        super.currentSpeed = currentSpeed;
        this.seatHeight = seatHeight;
    }



    public void setHeight(int newValue) {
        seatHeight = newValue;
    }
    @Override
    public String bicycleDesc() {
        return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed +"\nSeatHeight of bicycle is " + seatHeight);
    }
}
