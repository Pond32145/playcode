
package Success;
import java.util.Scanner;

public class WhileTrue {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print(""); 
        int a = kb.nextInt();
        while(true){ 
          System.out.print(a+"jaab");
          
           if(a<=1) break;  
        kb.close();        
        }
    }
}        