package lessons;

import java.util.HashMap;
import java.util.Map;

public class EquiLeader {
    public int solution(int[] A){
        int len=A.length;
        if(len<=1)return 0;
        
        Map<Integer, Integer> map= new HashMap<>();
        int maxNumber=0;
        int resIndex=0;
        for(int index=0; index<len; index++){
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
        if(maxNumber < (A.length/2))return 0;
        int quiLeader=0;
        int dominator=A[resIndex];
        int firstQuantity=0;
        int secQuantity=maxNumber;
        
        for(int index=0;index<len;index++){
//            System.out.println("A["+index+"]: "+A[index]);
            if(A[index]==dominator){
                
                int firstPartLen=index+1;
                firstQuantity++;
                
                int secPartLen=len-firstPartLen;
                secQuantity--;
//                System.out.println("firstPartLen: "+firstPartLen);
//                System.out.println("firstQuantity: "+firstQuantity);
//                System.out.println("secPartLen: "+secPartLen);
//                System.out.println("secQuantity: "+secQuantity);
                if((2*firstQuantity>firstPartLen) && (2*secQuantity>secPartLen)){
                    quiLeader++;
//                    System.out.println("quiLeader: "+quiLeader+"\n");

                }
            }else{
                int firstPartLen=index+1;
                
                int secPartLen=len-firstPartLen;
//                System.out.println("firstPartLen: "+firstPartLen);
//                System.out.println("firstQuantity: "+firstQuantity);
//                System.out.println("secPartLen: "+secPartLen);
//                System.out.println("secQuantity: "+secQuantity);
                if((2*firstQuantity>firstPartLen) && (2*secQuantity>secPartLen)){
                    quiLeader++;
//                    System.out.println("quiLeader: "+quiLeader+"\n");

                }
            }
        }    
        return quiLeader;
    }
}
