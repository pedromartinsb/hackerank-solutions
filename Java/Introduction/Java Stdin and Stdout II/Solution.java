import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Read input
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine(); // take off the newline
        String s = scan.nextLine();
        scan.close();

        // Print output
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Integer: " + i);
    }    
}
