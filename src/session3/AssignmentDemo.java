package session3;

public class AssignmentDemo {

    public static void main(String[] args) {
        // 5 Assignment operators
        int c = 30;
        System.out.println("Initial c: " + c + " (starting value)");
        c += 10;
        System.out.println("After c += 10: " + c + " (equivalent to c = c + 10)");
        c -= 5;
        System.out.println("After c -= 5: " + c + " (equivalent to c = c - 5)");
        c *= 2;
        System.out.println("After c *= 2: " + c + " (equivalent to c = c * 2)");
        c /= 3;
        System.out.println("After c /= 3: " + c + " (equivalent to c = c / 3)");
        c %= 4;
        System.out.println("After c %= 4: " + c + " (equivalent to c = c % 4)");
    }
}
