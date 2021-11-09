package Success;
import java.util.Scanner;
public class Fish1_3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("");
        int a = kb.nextInt();
        System.out.print("");
        int b = kb.nextInt();
        System.out.print("");
        int c = kb.nextInt();
        if (a>=b&&a>=c) {
            System.out.println("MAX : "+a);
        } else if (b>=a&&b>=c) {
            System.out.println("MAX : "+b);
        } else {
            System.out.println("MAX : "+c);
            
        }kb.close();
    }
}
