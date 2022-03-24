package lessons;

import java.util.Arrays;

public class Triangle {
    public int solution(int[] A){
       int len=A.length;
       if(len<3)return 0;
       
       Arrays.sort(A);
       System.out.println(Arrays.toString(A));
       
       for(int index=0; index<len-2; index++){
           if(A[index]>=0 && A[index] > (A[index+2]-A[index+1]) ){
               System.out.println("A["+index+"]: "+A[index]+"   A["+(index+1)+"]: "+A[index+1]+"  A["+(index+2)+"]"+A[index+2]);
               return 1;
           }
       }

        return 0;
    }
}
