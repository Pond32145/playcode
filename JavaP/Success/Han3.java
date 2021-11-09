package Success;
import java.util.Scanner;
public class Han3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("");
        int a=kb.nextInt();
        int i =1;
        while (i<=a) {
            if (i%3==0) {
               if(i%2!=0){
                    System.out.print(i+" ");
                } 
               }
            i++;
        }
        kb.close();
    }
}