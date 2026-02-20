import java.util.*;
public class ducknumber{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        if(num.charAt(0) == '0'){
            System.out.println("not a duck number");
        } else if (num.contains("0")){
        System.out.print("Duck number");
        } else {
            System.out.print("not a duck number");
            sc.close();
        }
    }
}

