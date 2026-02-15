import java.util.*;
public class Primenumber{
    public static void main(String args[]){
    Scanner him = new Scanner(System.in);
    int n = him.nextInt();
    int count=0;
    for(int i=1;i<=n;i++){
        if(n%i==0){
            count++;
        }
    }
    if(count==2){
        System.out.println("Prime");
    }
    else{
        System.out.println("Not prime number");
    }
    }
}