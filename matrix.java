import java.util.Arrays;

public class matrix {
    public static void main(String[]args){
        int [][] array = {{1,2,3},{4,5,6},{6,7,8}};
        int i = 0;
        int j = array.length-1;
        while(i<j){
            int [] temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
        for(int [] a : array){
            System.out.println(Arrays.toString(a));
        }
    }
}
    

