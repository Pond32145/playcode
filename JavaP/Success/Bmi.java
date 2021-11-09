package Success;
import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("");
        double a =kb.nextDouble();
        System.out.print("");
        double b =kb.nextDouble();
        double bmi = a/(b*b);
        System.out.println(bmi);
        kb.close();
    }
}