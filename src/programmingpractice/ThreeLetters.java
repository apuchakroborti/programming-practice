package programmingpractice;

public class ThreeLetters {
    public String solution(int A, int B){
        char c1='a', c2='b';
        int i=A, j=B;
        if(i<j){
            i=B;
            j=A;
            c1='b';
            c2='a';
        }
        StringBuilder builder= new StringBuilder(A+B);
        while(i>0){
            //start with the bigger value
            builder.append(c1);
            i--;
            if(i>j){
                builder.append(c1);
                i--;
            }
            if(j>0){
                builder.append(c2);
                j--;
            }
            
        }
        
        return builder.toString();
    }
    
}
