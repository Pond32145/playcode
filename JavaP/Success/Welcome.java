package Success;
import java.util.Scanner;
public class Welcome {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("");
        String a = kb.nextLine();
        System.out.println("สวัสดีครับ คุณ "+a);
 kb.close();   
}
}
