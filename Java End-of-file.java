import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lineNumber = 1;
        
        // Read lines until EOF (End-of-File) is reached
        while (sc.hasNext()) {
            String lineContent = sc.nextLine();
            // Print line number, space, and content
            System.out.println(lineNumber + " " + lineContent);
            lineNumber++;
        }
        
        sc.close();
    }
}
