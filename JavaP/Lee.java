
import java.util.Scanner;

public class Lee {
    public static void main(String[] args) {
       
        String []Lee ={"Lee","Ro"};
        Scanner kb = new Scanner(System.in);            //ยังไม่สมบูรณ์
        System.out.print(""); 
        String a =kb.nextLine();
        
        if (a==Lee[0]) {
            System.out.print("สวัสดีที่รัก");
        } else if(a==Lee[1]){
            System.out.print("หวัดดีเพื่อน");
        }else{
            System.out.print("ยินดีต้อนรับคุณ "+a);
        }kb.close();
    }
}
