import java.util.Scanner;

public class Solution {
    // Static variables for breadth and height
    static int B, H;
    static boolean flag = true;

    // Static initialization block
    static {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        
        // Validation logic matching Sample Output 2
        if (B <= 0 || H <= 0) {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        sc.close();
    }

    public static void main(String[] args) {
        // If flag is true, calculate and print the area as per Sample Output 1
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }
    }
}
