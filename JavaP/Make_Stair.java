
import java.util.Scanner;

public class Make_Stair{
    public static void main(String[] args) {           //ไม่เสร็จ
        Scanner kb= new Scanner(System.in);
        System.out.print("");
        int a= kb.nextInt();
        for (int i = 1; i <=a; i++) {
            //System.out.println("  ");
            for (int b = 1; b <=1; b++) { 
                
                System.out.print("__|");
                System.out.print("  ");
            }
           
        }
        kb.close();
    }
}