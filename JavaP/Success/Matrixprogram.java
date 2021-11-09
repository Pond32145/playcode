package Success;
public class Matrixprogram {
    public static void main(String[] args) {
        int width = 6;
        int height = 5;

        System.out.println("\tMatrix program");
        for (int i = 1; i <= height ; i++) { 
            for (int j = 1; j <= width ; j++) {
                System.out.print("\t" + (i * j));
            }
            System.out.println();
        }
    }
}