package day31_arrays;

public class AWS {
    public static void main(String[] args) {

        //app and we want to deploy on multiple zones

        String app = "etsy";
        String zones = "us-east1, us-west1, us-west2, us-west3";

        String [] allZone = zones.split(",");

        for (String eachzone: allZone ) {
            System.out.println(app + " is deloyed on " + eachzone);

            //        for(int i = 0; i < allZones.length; i++){
//            System.out.println(app + " is deploying on " + allZones[i]);
//        }

        }
    }
}
