package Success;
import java.util.Scanner;

public class Factorial_while {
    public static void main(String[] args) {
          Scanner kb = new Scanner(System.in);
          System.out.print("");
          int n = kb.nextInt();

          System.out.print(n+"!");
        int i =1;
        int num=1;
        while (i<=n) {
          num=num*i;
          i++;
        }System.out.println(" = "+num);
        kb.close();
      }
}
