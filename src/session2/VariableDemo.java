package session2;

public class VariableDemo {

    public static void main(String[] args) {

        // Variable declaration 1
        String name = "Alwan";
        int age = 25;
        String city = "New York";
        float height = 5.9f;
        boolean isStudent = false;
        char grade = 'A';

        System.out.println("Hello, " + name);
        System.out.println("You are " + age + " years old.");
        System.out.println("You live in " + city + ".");
        System.out.println("Your height is " + height + " feet.");
        System.out.println("Are you a student? " + (isStudent ? "Yes" : "No"));
        System.out.println("Your grade is " + grade + ".");


        // Variable declaration 2
        String hobby, profession;
        hobby = "Reading";
        profession = "Engineer";

        System.out.println("Your hobby is " + hobby + ".");
        System.out.println("Your profession is " + profession + ".");


        // Variable declaration 3
        String favoriteBook = "To Kill a Mockingbird", favoriteMovie = "Inception";
        System.out.println("Your favorite book is " + favoriteBook + ".");
        System.out.println("Your favorite movie is " + favoriteMovie + ".");



        // Variable declaration 4, if variable should not be changed

        // Use final keyword for variables that should not be changed
        final String favoriteColor = "Blue"; // This variable cannot be changed 
        System.out.println("Your favorite color is " + favoriteColor + ".");
    }
}
