package Success;
import java.util.Scanner;
    public class Grade {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("");
        int Score = kb.nextInt();
        String result="";
            if ((Score<0)||(Score>100)) {
                result="Incorrect score";
            }else  if(Score>=80){
                result="A";
            }else if(Score>=70){
                result="B";
            }else if(Score>=60){
                result="C";
            }else if(Score>=50){
                result="D";
            }else{
                result="F";
            }
           System.out.println(result);
           kb.close();     
        }
}