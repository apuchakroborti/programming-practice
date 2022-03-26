/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lessons;

import java.util.Stack;

/**
 *
 * @author USER
 */
public class WallStoneWorkable {
    public int solution(int[] H){
        int blockCount=0;
        Stack<Integer> stack = new Stack<>();
        for(int val:H){
            while(!stack.isEmpty() && stack.peek()>val){
                stack.pop();
            }
            if(!stack.isEmpty() && stack.peek()-val==0){
                
            }else{
                stack.push(val);
                blockCount++;
            }
        }
        return blockCount;
    }
}
