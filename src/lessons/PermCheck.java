package lessons;

import java.util.HashSet;
import java.util.Set;

public class PermCheck {
    public int solution(int[] A){
        Set<Integer> valSet=new HashSet<>();
        Set<Integer> indexSet=new HashSet<>();
        for(int i=0; i<A.length;i++){
            valSet.add(A[i]);
            indexSet.add(i+1);
        }
        for(int i=0; i<A.length;i++){
            valSet.add(A[i]);
            if(!valSet.contains(i+1))return 0;
        }
        return 1;
    }
}
