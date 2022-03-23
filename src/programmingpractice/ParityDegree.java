package programmingpractice;

public class ParityDegree {
    public int solution(int N){
        int res=0;
        while(N%2==0){
            res++;
            N=N/2;
        }
        return res;
    }
}
