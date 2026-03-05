import java.util.*;
import java.security.*;

public class Solution {

    public static void main(String[] args) {
        /* Read input string s from STDIN */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        
        try {
            /* 1. Initialize MessageDigest for MD5 */
            MessageDigest md = MessageDigest.getInstance("MD5");
            
            /* 2. Compute the hash using the input string's bytes */
            byte[] digest = md.digest(s.getBytes());
            
            /* 3. Convert the byte array to a hexadecimal string */
            StringBuilder hexString = new StringBuilder();
            for (byte b : digest) {
                // %02x ensures each byte is exactly 2 lowercase hex digits
                hexString.append(String.format("%02x", b));
            }
            
            /* 4. Print the final 32-character MD5 hash */
            System.out.println(hexString.toString());
            
        } catch (NoSuchAlgorithmException e) {
            // This algorithm is standard, but the exception must be handled
            throw new RuntimeException(e);
        }
    }
}
