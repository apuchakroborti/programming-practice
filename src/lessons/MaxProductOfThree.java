package lessons;

import java.util.Arrays;

public class MaxProductOfThree {
     public int solution(int[] A){
         Arrays.sort(A);
         int len = A.length;
         System.out.println(Arrays.toString(A)); 
         return Math.max(A[0]*A[1]*A[len-1], A[len-3]*A[len-2]*A[len-1]);
     }
}
