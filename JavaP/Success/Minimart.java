package Success;
import java.util.Scanner;

public class Minimart {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("รหัสสมาชิก : ");
        String z = kb.nextLine();
        System.out.print("จำนวนสินค้า : ");
        int a = kb.nextInt();
        int i = a*20; 
        System.out.print("จ่ายเงิน : ");
        int b = kb.nextInt();
        System.out.println();
        System.out.println("รหัสสมาชิก : "+z+"\nจำนวนสินค้า : "+a+"\nจ่ายเงิน : "+b);
        
       
        int j = b-i;
        System.out.println("เงินทอน : "+j);
        kb.close();
    }
}
