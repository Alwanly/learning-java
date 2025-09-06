package session4;

public class LargeOfNumberDemo {
    public static void main(String[] args) {

        int a = 10,b = 50,c = 30;

        System.out.println("The largest number is: " + (a>b && a>c ? "A" : (b>a && b>c ? "B" : "C")));
    }
}
