package Success;
import java.util.Scanner;

public class PyramidU {
    public static void main(String[] args) {
        
        Scanner kb=new Scanner(System.in);
        System.out.print("");
        int a = kb.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j <(a-i-1); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <((2*i)+1); k++) {
                System.out.print("รุ้ง");
            }   
            System.out.println();
            }
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <i+1; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <=(a-1)*2-i ; j++) {
                System.out.print("รุ้ง");
            }System.out.println();
        }
        kb.close();
    }
}