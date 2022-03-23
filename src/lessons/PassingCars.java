package lessons;

public class PassingCars {
    public int solution(int[] A){
        int count=0;
        int sum=0;
        for(int index=A.length-1;index>=0;index--){
            if(A[index]==1){
                count++;
            }else{
                if(sum > (Integer.MAX_VALUE-count)){
                    return -1;
                }else{
                    sum+=count;
                }
            }
        }
        return sum>1000000000?-1:sum;
    }
}
