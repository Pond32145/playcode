package Success;
import java.util.Scanner; 
public class GreadA {
    public static void main(String [] ages){
        
     Scanner kb = new Scanner(System.in);
     System.out.print("Enter Score = ");
     int Score = kb.nextInt();
        if (Score >100) {
            System.out.println("Error");
        }else if(Score <=0){
            System.out.println("Error");
        }else if(Score>=80){
            System.out.println("A");
        }else if(Score>=75){
            System.out.println("B+");
        }else if(Score>=70){
            System.out.println("B");
        }else if(Score>=65){
            System.out.println("C+");
        }else if(Score>=60){
            System.out.println("C");
        }else if(Score>=55){
            System.out.println("D+");
        }else if(Score>=50){
            System.out.println("D");
        }else{
            System.out.println("F");
            
    }kb.close(); 
  }
}