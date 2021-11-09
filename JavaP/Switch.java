import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.print("");
        int a =kb.nextInt();
        switch (a) {
            case '3':
                System.out.println("4555");
                break;
        
            default:
            System.out.println("-fo");
                break;
        }
        
        kb.close();
    }
}
