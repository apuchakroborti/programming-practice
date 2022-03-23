package lessons;

import java.util.HashMap;
import java.util.Map;

public class Distinct {
    public int solution(int[] A){
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int totalD = A.length;
        for(int val:A){
            if(map.containsKey(val)){
                totalD--;
            }else{
                map.put(val,1);
            }
        }
        return totalD;
    }
}
