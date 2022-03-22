package programmingpractice;

import java.util.*;

public class FirstUnique {
    public int solution(int[] A){
        Map<Integer, Integer> map=new LinkedHashMap<Integer, Integer>();
        for(int i=0; i<A.length;i++){
            map.put(A[i], map.getOrDefault(A[i], 0)+1);
        }
        for(int val:map.keySet()){
            if(map.get(val)<2){
                return val;
            }
        }
        return -1;
    }
}
