package activities;

public class Activity8 {
    public static void main(String[] a) {
        try{
            Activity8.exceptionTest("Will print to console");
            Activity8.exceptionTest(null);
            Activity8.exceptionTest("Won't execute");
        } catch (CustomException customException) {
            System.out.println("Inside catch block: " + customException.getMessage());
        }

    }
    static void exceptionTest(String str) throws CustomException{
       if (str == null){
           throw new CustomException("String is null");
       }
       else{
           System.out.println(str);
       }
    }

}