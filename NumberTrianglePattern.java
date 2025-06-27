public class NumberTrianglePattern {
    public static void printPattern(int n){
        int i,j;
        for(i=1; i<=n; i++){
            for(j=1; j<=n-i; j++){
                System.out.print(" ");//inner loop to print space
            }
            for(j=1; j<=i; j++){
                System.out.print(i+" ");//inner loop print star
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n=5;
        printPattern(n);
    }
}
