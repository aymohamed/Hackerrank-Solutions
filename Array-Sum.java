import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int Array_size = in.nextInt();
        int[] myArray = new int[Array_size];
        int i,j;
        for(i=0;i<Array_size;i++){
            myArray[i] = in.nextInt();

        }
        int sum = 0;

        for(j=0;j<Array_size;j++){
            sum +=myArray[j];


        }
        System.out.print(sum);

    }
}
