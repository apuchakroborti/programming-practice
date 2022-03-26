package lessons;
import java.util.*;
public class Dominator {
    public int solution(int[] A){
        if(A.length<1)return -1;
        if(A.length==1)return 0;
        Map<Integer, Integer> map= new HashMap<>();
        int maxNumber=0;
        int resIndex=0;
        for(int index=0; index<A.length; index++){
            if(map.containsKey(A[index])){
                map.put(A[index], map.get(A[index])+1);
                if(map.get(A[index])>maxNumber){
                    maxNumber=map.get(A[index]);
                    resIndex=index;
                }
            }else{
                map.put(A[index], 1);
            }
        }
        if(maxNumber > (A.length/2)){
            return resIndex;
        }else{
            return -1;
        }
    }
}
