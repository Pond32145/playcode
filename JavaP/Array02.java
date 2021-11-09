public class Array02{
    public static void main(String[] args) {
        int [][]a =new int[2][4];
        a[0][0]=10;
        a[1][1]=20;
        a[1][2]=30;
        a[1][3]=44;
        a[0][0]=84;

        for (int i = 1; i <= a.length; i++) {
            for (int j = 1; j <= a[i].length; j++) {
                System.out.printf("a[%d][%d] = %s\n",i,j,a[i][j]);
            }
            System.out.println();
        }
        

        
          
      
    }
}