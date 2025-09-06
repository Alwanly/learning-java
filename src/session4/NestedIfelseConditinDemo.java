package session4;

public class NestedIfelseConditinDemo {
    public static void main(String[] args) {

        int result_exam = 30;

        if (result_exam >= 50) {
            System.out.println("The person has passed the exam.");
            if (result_exam >= 90) {
                System.out.println("The person has passed with A grade.");
            } else if (result_exam >= 75) {
                System.out.println("The person has passed with B grade.");
            } else if (result_exam >= 60) {
                System.out.println("The person has passed with C grade.");
            } else {
                System.out.println("The person has passed with D grade.");
            }
        } else {
            System.out.println("The person has failed the exam.");
        }
    }
}
