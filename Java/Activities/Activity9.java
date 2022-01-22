package activities;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Apple");
        myList.add("Mango");
        myList.add("Orange");
        myList.add("Grapes");
        myList.add("Papaya");
        System.out.println("Print All the Objects:");
        for (String name:myList)
        {
            System.out.println(name);
        }
        System.out.println("3rd element in the list is: " + myList.get(3));
        System.out.println("Is Chicku is in list: " + myList.contains("Chicku"));
        System.out.println("Size of ArrayList: " + myList.size());
        myList.remove("Papaya");
        System.out.println("New Size of ArrayList: " + myList.size());
    }
}
