package Success;
import java.util.Scanner;
public class SommaiV2 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        
        int i =1;
        int a =0;
        System.out.print("");
        int n =kb.nextInt();

        while (i<=n) {
            System.out.print("");
            int s =kb.nextInt();
            a=a+s;
            i=i+1;
        }System.out.println(a);
        
       kb.close();
    }
} 