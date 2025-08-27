package session3;

public class IncrementDecrementDemo {

    public static void main(String[] args) {

        // 4 Increment & Decrement operators
        int count = 0;
        System.out.println("Initial count: " + count + " (starting value)");
        System.out.println("Post-increment (count++): " + (count++) + " (returns count then increments)");
        System.out.println("Current count after post-increment: " + count);
        System.out.println("Pre-increment (++count): " + (++count) + " (increments count then returns)");
        System.out.println("Post-decrement (count--): " + (count--) + " (returns count then decrements)");
        System.out.println("Current count after post-decrement: " + count);
        System.out.println("Pre-decrement (--count): " + (--count) + " (decrements count then returns)");

    }
}
