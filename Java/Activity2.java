package activities;

public class Activity2 {
    public static void main(String[] args) {
        int [] number = {10, 77, 10, 54, -11, 10};
        int expectedTotal = 30;
        int expectedNumber = 10;
        System.out.println(result(number,expectedNumber,expectedTotal));

    }
    public static boolean result(int[] number,int expectedNumber, int expectedTotal){
        int sum = 0;
        for(int i = 0;i<number.length;i++){
            if(number[i] == expectedNumber)
            {
                sum += number[i];
            }
        }
        return sum == expectedTotal;


    }
}
