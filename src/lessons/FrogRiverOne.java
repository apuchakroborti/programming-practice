package lessons;

import java.util.*;

public class FrogRiverOne {
    public int solution(int X, int[] A){
        int sum=0;
        int destSum=(X*(X+1))/2;
        Set<Integer> set = new HashSet<>();
        for(int index=0; index<A.length ;index++){
            if(set.contains(A[index])){
                continue;
            }
            set.add(A[index]);
            sum+=A[index];
            if(destSum==sum)return index;
        }
        return -1;
    }
}
