
package programmingpractice;

import java.util.*;

public class SparseBinaryDecomposition {
//    ArrayList<Integer> sparseList=null;
    public int solution(int N){
        long start = System.currentTimeMillis();
        int solution =-1;
        
//        sparseList = new ArrayList<Integer>();
        
        for(int i=2; i<=Math.ceil((N-1)/2); i++){
            if(this.isSparse(i)){
//                sparseList.add(i);
                int num2=N-i;
                if(isSparse(num2)){
                            System.out.print("Binary: "+Integer.toBinaryString(num2)+"\n");

                            System.out.print("total time: "+(System.currentTimeMillis() -start)+"\n");
                    return num2;
                }
            }
        }
//        if(sparseList.size()<2){
//            return solution;
//        }
//        int left = 0;
//        int right = sparseList.size()-1;
//        solution = getRes(left, right, N);

//        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//        for(Integer val: sparseList){
//            map.put(N-val, val);
//        }
//        for(Integer val: sparseList){
//            if(map.containsKey(val)){
//                solution=val;
//                break;
//            }
//        }
//        System.out.print("Binary: "+Integer.toBinaryString(solution)+"\n");
//        System.out.print("total time: "+(System.currentTimeMillis() -start)+"\n");
//        
        
        return solution;
    }
//    public int getRes(int left, int right, int N){
//        if(left>right)return -1;
//        if((sparseList.get(left)+sparseList.get(right))==N){
////            System.out.println(sparseList.get(left)+" + "+sparseList.get(right));
//                return sparseList.get(left);
//        }
//        int sol = getRes(left +1, right, N);
//        int sol2=  getRes(left, right-1, N);
//        return Math.max(sol, sol2);
//    }
    boolean isSparse(int N){
        if((N&(N>>1))>=1){
            return false;
        }
        return true;
    }
}
