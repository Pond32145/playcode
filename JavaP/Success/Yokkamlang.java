
package Success;
import java.util.Scanner;
public class Yokkamlang {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.print("");
        int a =kb.nextInt();
        System.out.print("");
        int b =kb.nextInt();
        int c =1;
        for (int i = 1; i <= b; i++) {
            c=c*a;
           
        } System.out.print(c);
        kb.close();
    }
}
