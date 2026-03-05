import java.util.*;
import java.security.*;

public class Solution {

    public static void main(String[] args) {
        /* Read input string s from STDIN */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        
        try {
            /* 1. Initialize MessageDigest for SHA-256 */
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            
            /* 2. Compute the hash using the input string's bytes */
            byte[] digest = md.digest(s.getBytes());
            
            /* 3. Convert the byte array to a 64-digit hexadecimal string */
            StringBuilder hexString = new StringBuilder();
            for (byte b : digest) {
                // %02x ensures each byte is exactly 2 lowercase hex digits
                // Total length will be 32 bytes * 2 = 64 characters
                hexString.append(String.format("%02x", b));
            }
            
            /* 4. Print the final SHA-256 hash */
            System.out.println(hexString.toString());
            
        } catch (NoSuchAlgorithmException e) {
            // SHA-256 is a standard algorithm, so this won't typically occur
            throw new RuntimeException(e);
        }
    }
}
