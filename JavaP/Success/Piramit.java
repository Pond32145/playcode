
package Success;
import java.util.Scanner;

public class Piramit {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.print("");
        int a = kb.nextInt();
        for (int i = 1; i <=a; i++) {
            for (int b = 1; b <=i; b++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        kb.close();
    }
}