package numbers;
public class CountFactors {
    public int solution(int N){
        int sq=(int) Math.sqrt(N);
        int factors=0;
        if(Math.pow(sq, 2)!=N){
            sq++;
        }else{
            factors++;
        }
        for(int f=1; f<sq; f++){
            if(N%f==0)factors+=2;
        }
        return factors;
    }
}
