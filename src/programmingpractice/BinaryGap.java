package programmingpractice;

import java.util.*;

public class BinaryGap {
    public int solution(int N){
        int maxGap=0;
        if(N<=3){
            return maxGap;
        }
        String binaryString = Integer.toBinaryString(N);
        List<Integer> list = new ArrayList<>();
        for(int i=0; i< binaryString.length() ; i++){
            if(binaryString.charAt(i)=='1'){
                list.add(i);
            }
        }
        if(list.size() <2)return maxGap;
        
        for(int i=0; i < list.size() -1 ; i++){
            int diff = list.get(i+1)-list.get(i)-1;
            maxGap = Math.max(diff, maxGap);
        }
        
        return maxGap;
    }
}
