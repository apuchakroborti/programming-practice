package lessons;

import java.util.Arrays;

public class PermMissingElem {
    public int solution(int[] A){
        if(A.length==0){
            return 1;
        }
        int res[]=new int[A.length+1];
        Arrays.fill(res, 0);
        for(int i : A){
            res[i-1]=i;
        }
        int pos=-1;
        for(int index=0; index<res.length; index++){
            if(res[index]==0){
                pos = index+1;
                break;
            }
        }
        return pos;
    }
}
