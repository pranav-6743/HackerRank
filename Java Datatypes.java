import java.util.*;

class Solution {
    public static void main(String []argh) {
        Scanner sc = new Scanner(System.in);
        // Read number of test cases
        int t = sc.nextInt();

        for(int i = 0; i < t; i++) {
            try {
                // Read input as long to check against smaller types
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                
                if(x >= -128 && x <= 127) System.out.println("* byte");
                if(x >= -32768 && x <= 32767) System.out.println("* short");
                if(x >= -2147483648L && x <= 2147483647L) System.out.println("* int");
                if(x >= -9223372036854775808L && x <= 9223372036854775807L) System.out.println("* long");
                
            } catch(Exception e) {
                // If input exceeds long's range, print that it can't be fitted
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
        sc.close();
    }
}
