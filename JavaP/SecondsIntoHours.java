import java.util.Scanner;
public class SecondsIntoHours {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("");
        double a = kb.nextDouble();                         //ยังไม่สมบูรณ์
        int c=60;
       
        double d = a/c;
        double f = d/c;
        System.out.format("%.4f", f);
         
          kb.close();
    }    
}
