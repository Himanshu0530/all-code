 import java.util.*;
public class oddsum {
   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int n=sc.nextInt();
        int sum =0;
        for(i=1; i<=n; i++){
            if(i%2!=0)
                sum = sum+i;
            System.out.println("sum of odd " +  sum);
            sc.close();
                
        }
    }
    
}

    

