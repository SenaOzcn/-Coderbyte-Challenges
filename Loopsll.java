import java.io.*;
import java.util.Scanner;

public class Loopsll {

    public static void main(String[] args) {
        // (a+2^0*b)+(a+2^1*b)+(a+2^2*b)+...+(a+2^n-1*b)
        int a, b, n, t;
        
        Scanner input = new Scanner(System.in);
        t = input.nextInt();
        
        for (int i = 0; i < t; i++) {
            a  = input.nextInt();
            b  = input.nextInt();
            n  = input.nextInt();
            
            for (int j = 0; j < n; j++) {
                a += b;
                System.out.print(a + " ");
                b *= 2;
            }
            System.out.println();
        }
    }
}
