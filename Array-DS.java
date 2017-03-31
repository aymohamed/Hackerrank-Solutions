import java.io.*;
import java.util.*;

/*
Given an array,A, of N integers, print each element
in reverse order as a single line of space-separated integers.

*/

public class Solution {

     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); //n is the number of integers in the array
        int A[] = new int[n];
        int len = A.length; //length of the array which is n 
        int i;
        int k;
        //loop that populates the array with elements
        for(i=0; i< n; i++){
            A[i] = in.nextInt();
        }
         //reverses elements of the array and prints them on console
        for(k=len-1;k>=0;k--){
            System.out.print(A[k] + " ");
        }
    }
}
