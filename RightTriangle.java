public class RightTriangle {
    public static void main(String[] args){
        int rows = 5;
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");  // Use print, not println
            }
            System.out.println();       // Move to the next line after each row
        }
    }
}
