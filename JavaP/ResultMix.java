import java.util.Scanner;

public class ResultMix {  
     public static void main(String[] args) {
        
    Scanner kb = new Scanner(System.in);
    int result,summ = 0;

    int n = kb.nextInt();
    for(int i = 0; i<=n; i+=2){
        result = i*i; 
        summ = summ+result;
    }
    System.out.println(summ);
    kb.close();
    }
}