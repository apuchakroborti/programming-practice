package lessons;

import java.util.*;

public class Fish {
    public int solution(int[] A, int[] B){
        Stack<Integer> weight = new Stack<>();
        Stack<Integer> direction = new Stack<>();
        int len=A.length;
        
        weight.push(A[0]);
        direction.push(B[0]);
        System.out.println("\nstack:"+weight.toString()+"");
        System.out.println("stack:"+direction.toString()+"\n");

        for(int i=1; i< len; i++){
            if(B[i]==1){
                weight.push(A[i]);
                direction.push(B[i]);
                System.out.println("\nstack:"+weight.toString()+"");
                System.out.println("stack:"+direction.toString()+"\n");
            }else if(direction.peek()==0 && B[i]==0){
                weight.push(A[i]);
                direction.push(B[i]);
                System.out.println("\nstack:"+weight.toString()+"");
                System.out.println("stack:"+direction.toString()+"\n");
            }else{//peek dir 1 and comming 0; will meet
                while(true){                    
                    if(weight.size()<=0){
                        weight.push(A[i]);
                        direction.push(B[i]);
                        System.out.println("\nstack:"+weight.toString()+"");
                        System.out.println("stack:"+direction.toString()+"\n");
                        break;
                    }
                    else if((A[i] > weight.peek() ) && direction.peek()==1 ){
                        weight.pop();
                        direction.pop();
                        System.out.println("\nstack:"+weight.toString()+"");
                        System.out.println("stack:"+direction.toString()+"\n");
                    }else if(direction.peek()==0){
                        weight.push(A[i]);
                        direction.push(B[i]);
                        System.out.println("\nstack:"+weight.toString()+"");
                        System.out.println("stack:"+direction.toString()+"\n");
                        break;
                    }
                    else if ((A[i] < weight.peek()) && direction.peek()==1){
                        System.out.println("\nstack:"+weight.toString()+"");
                        System.out.println("stack:"+direction.toString()+"\n");
                        break;
                    }
                }   
            }
        }
        return weight.size();
    }
}
