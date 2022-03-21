package programmingpractice;

public class ArrListLen {
    public int solution(int[] A){
        if(A[0]==-1){
            return 1;
        }
        if(A.length==1){
            return 1;
        }
        int length = 1;
        int value = A[0];
//        System.out.println("Value: "+value);
        while(value!=-1){
            length++;
            value=A[value];
//            System.out.println("Value: "+value);
        }
        return length;
    }
}
