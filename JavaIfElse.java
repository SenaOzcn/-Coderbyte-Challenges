import java.util.Scanner;

public class JavaIfElse {

    public static void main(String[] args) {
        int n;
        
        Scanner input = new Scanner(System.in);
        
        n = input.nextInt();
        
        if ((n %2 == 1) || (n >= 6 && n <= 20)) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }
    }
}
