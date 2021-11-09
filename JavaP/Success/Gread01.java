package Success;
import java.util.Scanner;
public class Gread01 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("กรุณาป้อนคะแนน : ");
        int n = kb.nextInt();
        if (n < 50) {
            System.out.println("คุณได้เกรด 0 ");
        }
        else if ( n<55) {
            System.out.println("คุณได้เกรด 1 ");
        }
        else if ( n<60) {
            System.out.println("คุณได้เกรด 1.5 ");
        }
        else if (n<65) {
            System.out.println("คุณได้เกรด 2 ");
        }
        else if (n<70) {
            System.out.println("คุณได้เกรด 2.5 ");
        }
        else if ( n<75) {
            System.out.println("คุณได้เกรด 3 ");
        }    
        else if (n<80) {
            System.out.println("คุณได้เกรด 3.5 ");    
        }
        else if (n>=80 && n<100) {
            System.out.println("คุณได้เกรด 4 ");
        }else{
            System.out.println("error");
        }kb.close(); 
    }
}