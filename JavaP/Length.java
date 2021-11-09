import java.util.Scanner;

public class Length {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("");
        String s = kb.next();               //ยัง
        System.out.print("");
        String d = kb.next();
        String a=s;
        String b=d;
        System.out.println(a.length());
        System.out.println(b.length());

        kb.close();
    }
}
