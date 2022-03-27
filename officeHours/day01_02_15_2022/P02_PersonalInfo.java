package day01_02_15_2022;

public class P02_PersonalInfo {
    public static void main(String[] args) {
         /*
         Task02:   Variables(Primitives - Non Primitives ),Concatenation and Escape Sequences

                      Create class named "PersonInfo" and make a main method

                            Create variables and give value related to you:

                                - String name
                                - byte age
                                - char gender
                                - boolean student
                                - short number of siblings
                                - long favorite number
                                - int number of seasons in your area
                                - double birth date: (month.day)
                                - int year
                                - String full birthday date with year
                                - String favorite quote
                                - Print the person information with using concat/escape characters

         */
String name = "Irina";
byte age = 33;
        char gender = 'F';
        boolean isStudent = true;
        short numberOfSiblings = 1;
        long favoriteNumber = 33;
        int numberOfSeasons = 2;
        double birthDate = 12.15, year = 1988;
        String fullBirthday = birthDate +"." + year;
        String favoriteQuote = "All I do is win";
        System.out.println(fullBirthday);

        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("favoriteQuote = " + favoriteQuote);


        System.out.println("============ Escape Seq ============");

        System.out.println("\tname :"+ name+"\n\tage: "+age+"\n\tgender : "+gender );

        // DRY --> Don't Repeat Yourself
        // Keep it Simple






    }
}
