import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("================================");
        
        for(int i = 0; i < 3; i++) {
            String sc = s.next();
            int x = s.nextInt();
            System.out.printf("%-15s%03d%n", sc, x);
        }
        
        System.out.println("================================");
    }
}
