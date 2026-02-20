
import java.util.*;

public class GradeCalculator{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 90) {
            System.out.print("A+");
        
    }
        else if (n >= 75 && n <= 89) {
                    System.out.println("A");
        
        }
        else if (n >= 60 && n <= 74) {
                    System.out.println("B");
        
        
                }
        else if (n >= 40 && n <= 59) {
                    System.out.println("C");
            
         }
        else{
             System.out.println("F");
        sc.close();
    }
}
}
