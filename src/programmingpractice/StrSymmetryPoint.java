package programmingpractice;

public class StrSymmetryPoint {
    public int solution(String S){
        if(S.length()==1){
            return 0;
        }
        if(S.length()%2==0){
            return -1;
        }
        int midPoint = S.length()/2;
        String firstHalf = S.substring(0, midPoint);
        StringBuilder secondHalf = new StringBuilder(S.substring(midPoint+1, S.length()));
        secondHalf = secondHalf.reverse();
        String sec = secondHalf.toString();
        if(firstHalf.equals(sec)){
            return midPoint;
        }
        
        return -1;
    }
}
