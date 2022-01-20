package activities;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Activity6 {
    public static void main(String[] args) throws InterruptedException {
        Plane plane = new Plane(10);
        plane.onboard("Abbas");
        plane.onboard("sruthi");
        System.out.println("Plane took off at: " + plane.takeOff());
     //   List<String>  passesngers = plane.getPassengers();
        System.out.println("People on the plane: " + plane.getPassengers());
      //  System.out.println(passesngers.toString());
        Thread.sleep(5000);
        plane.land();
       Date lastTimeLanded =  plane.getLastTimeLanded();
        System.out.println(lastTimeLanded);


    }
}
