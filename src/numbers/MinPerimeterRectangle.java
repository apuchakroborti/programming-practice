package numbers;
public class MinPerimeterRectangle {
     public int solution(int N){
        int sq=(int) Math.sqrt(N);
//        int factors=0;
        int perimeter=Integer.MAX_VALUE;
        
        if(Math.pow(sq, 2)!=N){
            sq++;
        }else{
            perimeter=4*sq;
        }
        
        for(int f=1; f<sq; f++){
            if(N%f==0){
                perimeter=Math.min(2*(f+(N/f)), perimeter);
            }
        }
        return perimeter;
    }
}
