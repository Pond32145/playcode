
package Success;
import java.util.Scanner;

public class RegisterLogin {
    public static void main(String[] args) {
      while (true) {
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Username : ");
        String a = kb.nextLine();
        System.out.print("Password : ");
        String b = kb.nextLine();
           
            System.out.print("UsernemeLogin : ");
            String c = kb.nextLine();
            System.out.print("PasswordLogin : ");
            String d = kb.nextLine();
       
            String name =a; 
            String pass =b;
        
          if((c.equals(name))&&(d.equals(pass))) {    
           System.out.println("Success");
           break;
        }else {
          System.out.println("Error");
        } kb.close();
      } 
    }
}     