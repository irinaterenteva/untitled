package day04_02_23_2022;

public class PO1_BMI {
    public static void main(String[] args) {

        double mass=82.4;
        double height = 1.82;
        double BNI = mass / (height*height);
        System.out.println("BMI = " + BNI);
        String result ="";

        if (BNI<18.5){
           result= "Underweight";

        }else if (BNI>=18.5 && BNI<25){
            result= "Normal weight";

        }else if (BNI>=25 && BNI<30){
            result= "Overweight";
        }else{
           result= "Obese";
        }
        System.out.println("Your BMI index refers : " + result);
    }

}
