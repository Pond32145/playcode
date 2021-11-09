import java.util.Scanner;

public class Pythagoras {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("");
        Double a = kb.nextDouble();
        System.out.println("");                 //ยังไม่สมบูรณ์
        Double b = kb.nextDouble();
        Double c=1d;
        //for (Double i = 1; i <= a; i++) {
            c=(a * a) + (b * b);
         System.out.format("%.2f",c*c);

        
        //}
       
        kb.close();
    }
}
