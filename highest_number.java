import java.util.Scanner;
public class highest_number {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int max;
        if ( A >= B && A >= C){
            max = A;
        } else if ( B >= A && B >= C){
            max = B;
        } else {
            max = C;
        }
        System.out.print(max);
        
        sc.close();
            
}
    }
    

