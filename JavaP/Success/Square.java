package Success;
import java.util.Scanner;
public class Square {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("");
        int a = kb.nextInt();

        for(int i=0;i<a;i++) {  // ควบคุมจำนวนบรรทัดเท่ากับ a
            for(int j=0;j<a;j++){   // ควบคุมจำนวนที่จะวาดแต่ละบรรทัด
                if (i==0||i==(a-1)) {// บรรทัดแรกและบรรทัดสุดท้าย
                    System.out.print("#");
                }else{
                    if(j==0||j==(a-1)){         // ตำแหน่งแรกและตำแหน่งสุดท้าย
                        System.out.print("#");
                    }else{
                        System.out.print(" ");
                    }
                }
            }System.out.println();

        }   System.out.println();                
            
        kb.close();    
    }
}