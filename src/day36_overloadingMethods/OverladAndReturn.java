package day36_overloadingMethods;

public class OverladAndReturn {
    public static void method(){
        System.out.println("default empty method");
    }

    // I will try to overload by changing the return type

  /*this is not valid , changing the return type does not overload
   public static int method (){
   */

   public static int method (int a){
       return 0;
    }



}
