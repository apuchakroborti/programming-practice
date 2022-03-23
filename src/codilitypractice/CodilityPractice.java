/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codilitypractice;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class CodilityPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        System.out.println("Input A: ");
        int val1=input.nextInt();
        System.out.println("Input B: ");
        int val2=input.nextInt();
        ThreeLetters letters=new ThreeLetters();
        System.out.println("ThreeLetters: "+letters.solution(val1, val2));
        
//        SparseBinaryDecomposition sp = new SparseBinaryDecomposition();
//        System.out.println("Solution is: "+sp.solution(val));

//        ParkingBill parkingBill = new ParkingBill();
//        System.out.println("Bill: "+parkingBill.solution("10:00", "23:00"));

//        ParityDegree parityDegree = new ParityDegree();
//        System.out.println("Power of 2 max Res: "+parityDegree.solution(val));

    }
    
}
