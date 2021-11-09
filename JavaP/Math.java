import java.util.Scanner;
public class Math {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        while (true) {
            
        
        System.out.println("กด 1 เพื่อหาพื้นที่สี่เหลียม");
        System.out.println("กด 2 เพื่อหาพื้นที่สามเหลียม");
        //System.out.println("กด 3 เพื่อหาพื้นที่วงกลม");
        System.out.println("กด 0 เพื่อจบการทำงาน");
        System.out.print("กรุณาเลือก : ");
        int i = kb.nextInt();
        
        while (true) {
             if (i==1) {
                System.out.print("กรอกความสูง : ");
                int a = kb.nextInt();
                System.out.print("กรอกฐาน : ");
                int b = kb.nextInt();
                int c = a*b;
                System.out.println(c);
            }
            if(i==0)break;
        } 

        while (true) {
            if (i==2) {
               System.out.print("กรอกความสูง : ");
               int a = kb.nextInt();
               System.out.print("กรอกฐาน : ");
               int b = kb.nextInt();
               double c=0.5;
               double j =c*a*b;
               System.out.println(j);
           }
           if(i==0)break;
       } 
       if(i==0){
           System.out.println("End of Program");
       break;
       }
       
    kb.close();
    }
}
}
