package lessons;

import java.util.*;
import java.util.stream.Collectors;

public class TapeEquilibrium {
    public int solution(int[] A){
        int sum = 0; 
        for(int val:A){
            sum+=val;
        }
        int resDiff = Integer.MAX_VALUE;
        int diff = Integer.MAX_VALUE;
        
        int prevSum = 0;
        int rightSum =0;
        for(int i=1; i< A.length; i++){
            prevSum+=A[i-1];
            rightSum=sum-prevSum;
            diff = Math.abs(prevSum-rightSum);
            resDiff = Math.min(resDiff, diff);
        }
        return resDiff;
    }
}
