package Success;
import java.util.Scanner;

public class Kamlang2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("");
        int a = kb.nextInt();
        System.out.print("");
        int b = kb.nextInt();
        int i =1;
        int c =1;
        while (i<=b) {
            c=c*a;
            i++;
           } System.out.print(c);
        kb.close();
    }
}
