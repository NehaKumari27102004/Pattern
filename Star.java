public class Star {
    public static void main(String[] args){
        for(int i = 0; i < 7; i++){            // 7 rows
            for(int j = 0; j < 8; j++){        // 8 columns
                System.out.print("* ");        // Use print to stay on same line
            }
            System.out.println();              // Move to next line after each row
        }
    }
}
