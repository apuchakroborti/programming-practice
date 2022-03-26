package lessons;

import java.util.Arrays;
//MaxSliceSum
public class MaxProfit {
    public int solution(int[] A){
        int len=A.length;
        if(len<2)return A[0];
//        if(len<2)return 0;
        
//        int diff[]=new int[len];
//        
//        diff[0]=0;
//        for(int i=1; i<len; i++){
//           diff[i]=A[i]-A[i-1]; 
//        }
//        System.out.println("A: "+Arrays.toString(A));
//        System.out.println("Diff: "+Arrays.toString(diff));
//        int localMax=diff[0];
//        int absMax=diff[0];
        int localMax=A[0];
        int absMax=A[0];
        
        for(int index=1; index<len;index++){
            int nextSum=A[index]+localMax;
            localMax=Math.max(nextSum, A[index]);
            absMax=Math.max(absMax, localMax);
//            System.out.println("currEle: "+diff[index]);
//            System.out.println("nextSum: "+nextSum);
//            System.out.println("localMax: "+localMax);
//            System.out.println("absMax: "+absMax+"\n");
        }
//        if(absMax>0)return absMax;
//        else return 0;
        return absMax;
    }
}
