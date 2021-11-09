import java.util.Scanner;

public class Remix {
    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        System.out.print("");
        int a = kb.nextInt();
        System.out.print("");
        int b = kb.nextInt();
        int x =a-b;
        System.out.println(x);
        kb.close();
    }
}