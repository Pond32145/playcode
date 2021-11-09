import java.util.Scanner;

public class Bottlecap {
    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);

        int a =3;
        System.out.print("");
        int n = kb.nextInt();
            a = n / a;
        int s = n % a;
        int c = a + n +s;

        int m = c / a;
        int y = c % a;
        int j = n + m + y;
        
        /*if(n==1){
            System.out.println(1);
        }else if (c%3==2) {
            System.out.println(j);
        }else if(c%3==1){
            System.out.println(c);
        
        }else{
            System.out.println(j);
        }*/
        System.out.println(j);
        kb.close();
    }
}
