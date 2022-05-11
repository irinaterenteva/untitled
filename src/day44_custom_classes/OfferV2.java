package day44_custom_classes;

public class OfferV2 {

       /*
        create a class called Offer

        - data:

            location, company, salary, is full time, number of PTO
    */

    String location;
    String company;
    double salary;
    boolean isFullTime;
    int numberOfPTO;




    /*
            - constructor

                - create a constructor that creates an Offer object with the company and location

                - create a constructor that creates an Offer object with the company, location, and salary

                - create a constructor that creates an Offer object with the company, location, salary, is full time, and number of PTO

        */

    public OfferV2(String location, String company) {
        this.location = location;
        this.company = company;
    }


    public OfferV2(String location, String company, double salary) {
        this(location,company);
               this.salary = salary;


    }

    public OfferV2(String location, String company, double salary, boolean isFullTime, int numberOfPTO) {
        this(location,company,salary);
        this.isFullTime = isFullTime;
        this.numberOfPTO = numberOfPTO;
    }

    /*
        - method:

            toString()
                print all the employees information

    Create a separate class to create and test the Offer objects
     */
    public String toString() {
        String info = company + " located in " + location;
        info += "\n" + (salary > 0 ? salary : "");
        info += "\n" + (isFullTime ? "Full Time" : "Contract");
        info += "\n" + (numberOfPTO>0 ? numberOfPTO : "");


        return info;
    }
}
