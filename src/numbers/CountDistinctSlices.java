package numbers;

import java.util.Arrays;

public class CountDistinctSlices {
     public int solution(int M, int[] A){
         boolean visit[]=new boolean[M+1];
//         Arrays.fill(visit, false);
         int left=0, right=0, len=A.length, count=0;
         
         while(left<len && right <len){
             if(visit[A[right]] == false){
//                 System.out.println("A["+right+"]: "+A[right]);
//                 System.out.println("Left: "+left+" Right: "+right);
                 count+=right-left+1;
//                 System.out.println("Count: "+count);
                 
                 if(count >= 1000000000)return 1000000000;
                 visit[A[right]]=true;
//                 System.out.println("visit: "+Arrays.toString(visit)+"\n");
                 right++;
             }else{
                 visit[A[left]]=false;
//                 System.out.println("visit: "+Arrays.toString(visit)+"\n");
                 left++;
             }
             
         }
         return count;
     }
}
