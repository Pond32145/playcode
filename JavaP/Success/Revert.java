package Success;
import java.util.Scanner;


public class Revert {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in); // ประกาศตัวแปรเพื่อรับข้อมูลจากคีบอร์ด
                
				System.out.print("Input : ");
                String a = kb.next(); // รอรับข้อมูลข้อความ
				System.out.print("Output : ");
				for (int i = (a.length() - 1); i >= 0; i--) { // ตั้ง index เพื่ออ้างอิงตำแหน่งสุดท้ายก่อน
					
				System.out.print(a.charAt(i)); // แสดงตัวอักษรทีละตัวตาม index
				
			}
			
		kb.close();
	}
}