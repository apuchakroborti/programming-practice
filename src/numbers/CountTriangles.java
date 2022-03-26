package numbers;

import java.util.Arrays;

public class CountTriangles {
    public int solution(int[] A){
        Arrays.sort(A);
        int count=0;
        int len=A.length;
        for(int first=0; first < len-2; first++){
//            System.out.println("first: "+first);
            int second=first+1;
            int third=first+2;

            while(second<len-1){
                
                if(third<len && A[first] > (A[third]-A[second])){
//                    System.out.println("second: "+second);
//                    System.out.println("third: "+third+"\n");
                    third++;
                }else{
                    count +=third-second-1;
//                    System.out.println("second: "+second);
//                    System.out.println("third: "+third+"");
//                    System.out.println("count: "+count+"\n");
                    second++;
                }
            }
//            System.out.println("\n");
            
        }
        
        return count;
        
    }
}
