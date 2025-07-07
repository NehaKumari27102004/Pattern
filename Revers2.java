import java.util.Scanner;

public class Revers2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String For Reverse");
        String str=sc.nextLine();
        StringBuilder sb= new StringBuilder();
        sb.append(str);
        sb.reverse();
        System.out.println(sb);
        sc.close();
    }
}
