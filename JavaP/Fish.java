
import java.util.Scanner;
public class Fish {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int Max =1;
         while (true) {
            System.out.print("");
            int a = kb.nextInt();
                                                    //ยังไม่สมบูรณ์
            if (a==0) {
                break;
            }
            System.out.print("");
            if (a==Max) {
                System.out.println(a);
            } else {
                System.out.println(a);
            }
        }
        kb.close();
    }
}