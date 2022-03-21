/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingpractice;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ProgrammingPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] list = new int[]{1, 4, 7, 3, 2, -1,5,5};
        ArrListLen arr = new ArrListLen();
        System.out.println("ArrListLen result: "+arr.solution(list));


//BinaryGap
//        int N = 0;
//        while(N!=-1){
//        System.out.println("Enter the value of N for the testing the BinaryGap:");
//        BinaryGap binaryGap = new BinaryGap();
//        Scanner input = new Scanner(System.in);
//        N = input.nextInt();
//        System.out.println("BinaryGap result:"+binaryGap.solution(N));
//        }
    }
    
}
