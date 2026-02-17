public class gcd {
public static void main(String[] args) {
    int a=15,b=10;
    b = 10;
    int temp=0,lcm=Math.max(a,b);
    for(int i=2;i<=Math.min(a,b);i++){
        if((a%i==0)&&(b%i==0)){
temp=i;

        }
    }                                                                                                                                                                                                                                                                                                                                                                             
    System.out.println(temp);
}
}
