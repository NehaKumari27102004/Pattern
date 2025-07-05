public class RightPascalTriangle {
    public static void printPattern(int n){
        int i, j;
        int num = 1;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        for (i = n-1; i >= 1; i--) {
            
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    // Driver Function
    public static void main(String args[]) {
        int n = 4;
        printPattern(n);

    }
}
