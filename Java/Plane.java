package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plane {
    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;

    public Plane(int maxPassengers){
        this.maxPassengers = maxPassengers;
        passengers = new ArrayList<>();
    }
    public void onboard(String passenger){
        passengers.add(passenger);
    }
    public Date takeOff(){
        Date lastTimeTookOf = new Date();
        System.out.println(lastTimeTookOf);
        return lastTimeTookOf;
    }
    public void land(){
        lastTimeLanded = new Date();
        passengers.clear();
    }
    public Date getLastTimeLanded(){
        return lastTimeLanded;
    }
    public List<String> getPassengers(){
        return  passengers;
    }
}