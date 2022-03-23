/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingpractice;

/**
 *
 * @author USER
 */
public class OddOccurrencesInArray {
    public int solution(int[] A){
        int res=0;
        for(int i: A){
            res = res ^ i;
        }
        return res;
    }
    
}
