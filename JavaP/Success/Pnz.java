package Success;
import java.util.Scanner;
public class Pnz {
    public static void main(String[] args) {
      Scanner kb = new Scanner(System.in);
      System.out.print("");
      long a = kb.nextLong();
        if(a>0){
            System.out.println("Positive Number");
        } else if(a<0) {
            System.out.println("Negative Number");
        }else{
            System.out.println("Zero Number");
        }
       kb.close();
 } 
}
