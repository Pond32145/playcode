import java.util.Scanner;

public class Fac{
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.print("");
        int n =kb.nextInt();
        //System.out.print("["+n+"]");
        int num=1;
        for (int i = 1; i <=n; i++) {
            num=num*i;
            //if(i<n){
            //System.out.print(i+" x ");
            //}else{
            //System.out.print(i);
            //}  
        }System.out.print(n+"!:"+num);
        
       kb.close();
    }
}