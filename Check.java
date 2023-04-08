import java.util.*;

public class check {

    public boolean isPossible(int a, int b, int c, int d) {
        if (a > c || b > d) { // base condition
            return false;
        }
        if (a == c && b == d) { // termination condition
            return true;
        }
        // recursive call
        return (isPossible(a + b, b, c, d) || isPossible(a, a + b, c, d));
    }

    public static void main(String[] args) {
        check obj = new check(); // make the object
        int a, b, c, d; // declare the integers

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt(); // enter the coordinates
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        if (obj.isPossible(a, b, c, d)) { // call the function
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
