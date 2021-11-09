package Success;
import java.util.Scanner;

public class While01 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("");
        int a = kb.nextInt();
        int i=1;
        
        while(i<=a){ 
            System.out.print("Pond "); 
            i++;
        }
        kb.close();
    }
}
