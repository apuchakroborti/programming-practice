/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingpractice;

import java.util.Scanner;
import lessons.Brackets;
import lessons.Distinct;
import lessons.Dominator;
import lessons.EquiLeader;
import lessons.Fish;
import lessons.FrogJmp;
import lessons.FrogRiverOne;
import lessons.MaxProductOfThree;
import lessons.MaxProfit;
import lessons.PassingCars;
import lessons.PermCheck;
import lessons.PermMissingElem;
import lessons.TapeEquilibrium;
import lessons.Triangle;
import lessons.WallStoneWorkable;
import numbers.ChocolatesByNumbers;
import numbers.CountDistinctSlices;
import numbers.CountTriangles;

/**
 *
 * @author User
 */
public class ProgrammingPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CountTriangles countTriangles=new CountTriangles();
        int A[]=new int[]{10,2,5,1,8,12};
        System.out.println("Count Triangles: "+countTriangles.solution(A));
        

//        CountDistinctSlices count = new CountDistinctSlices();
//        int M=6;
//        int A[]=new int [] {3,4,5,5,2};
//        System.out.println("CountDistinctSlices: "+count.solution(M, A));
//        ChocolatesByNumbers cho = new ChocolatesByNumbers();
//        int N=input.nextInt();
//        int M=input.nextInt();
//        int N=1000000000;
//        int M=1;
//        int N =(int) (Math.pow(3, 9)* Math.pow(2, 14));
//        int M=(int) (Math.pow(2, 14)*Math.pow(2, 14));
//        System.out.println("Max chocolate: "+cho.solution(N, M));
        
//        int arr[]=new int [] { 23171, 21011, 21123, 21366, 21013, 21367 };
//        int arr[] = new int[]{5, -7, 3, 5, -2, 4, -1 };
//        MaxProfit pro=new MaxProfit();
//        System.out.println("MaxProfit: "+pro.solution(arr));
        
        
//        int[] arr=new int [] { 4, 3, 4, 4, 4, 2};
//        int[] arr=new int [] {4, 4, 2, 5, 3, 4, 4, 4 };
//        EquiLeader  el = new EquiLeader();
//        System.out.println("Equi Leader: "+el.solution(arr));
        
//        Dominator d=new Dominator();
//        int[] arr=new int [] { 8, 8, 8, 7, 9, 8, 7, 5, 8 };
//        int[] arr=new int [] { };
//        System.out.println("Dominator: "+d.solution(arr));
        
//        StoneWallNew st = new StoneWallNew();
//        int[] arr=new int [] { 8, 8, 5, 7, 9, 8, 7, 4, 8 };
//        int[] arr = new int [] { 8, 8, 5, 7, 9, 8, 7, 4, 8 }; //7
//        int[] arr=new int [] { 8, 8, 5, 7, 9, 8, 7, 5, 8 }; //6
      //        int[] arr = new int [] { 1, 2, 3, 4, 3 }; //4 
//      int[] arr = new int [] { 8, 8, 5 }, 2 };
//      int[] arr = new int [] { 8, }, 1 },
//      int[] arr = new int [] { 8, 8 }, 1 },
//      int[] arr = new int [] { 8, 8, 8, 8, 8 }, 1 },
//      int[] arr = new int [] { 1000000000 }, 1 },
//      int[] arr = new int [] { 1000000000, 2 }, 2 },
//      int[] arr = new int [] { 2, 1000000000, 2 }, 2 },
//      int[] arr = new int [] { 2, 1000000000, 2, 1000000000 }, 3 },
//      int[] arr = new int [] { 2, 1000000000, 2, 1000000000, 1000000000 },
//        System.out.println("Minimum Wall: "+st.solution(arr));

//        int[] arr=new int [] { 8, 8, 5, 7, 9, 8, 7, 4, 8 };
//        WallStoneWorkable st=new WallStoneWorkable();
//        System.out.println("Minimum Wall: "+st.solution(arr));
        
//        Fish fish = new Fish();
//        int[] A=new int[]{4,3,2,1,5};
//        int[] B=new int[]{0,1,0,0,0};
//        int[] A=new int[]{0, 1};
//        int[] B=new int[]{1, 1};
//        int A[]=new int [] { 4, 3, 2, 1, 5 };
//        int B[]=new int [] { 1, 0, 1, 0, 1 };
//        int A[] = new int [] { 7, 4, 3, 2, 5, 6 };
//        int B[]=new int [] { 0, 1, 1, 1, 0, 1 };
//        int A[] = new int [] { 4, 3, 2, 5, 6 };
//        int B[] = new int [] { 1, 0, 1, 0, 1 };
//        int A[] = new int [] { 4, 3, 2, 1, 5 };
//        int B[] = new int [] { 0, 1, 1, 0, 0 };
//          int A[] = new int [] { 3 };
//          int B[] = new int [] { 1 };
//            int A[] = new int [] { 3, 4, 2, 1, 5 };
//            int B[] = new int [] { 1, 0, 0, 0, 0 };
//        System.out.println("Alive fish: "+fish.solution(A, B));
        
//        Brackets bracket= new Brackets();
//        String str= new String("{[()()]}");
//        String str = new String("([)()]");
//        System.out.println("Brackets: "+bracket.solution(str));
        
//        Triangle tri = new Triangle();
//        int[] arr = new int[]{-2147483648,0,48,2147483600, 2147483647};
//        int[] arr=new int[]{10,2,5,1,8,20};
//        int[] arr=new int[]{-30,-29,2,3,4,5,6};
//            int[] arr = new int[]{-5, 5, -5, 4};
//        System.out.println("Triangle present: "+tri.solution(arr));
        
        
        
//        MaxProductOfThree maxProductOfThree = new MaxProductOfThree();
//        int[] arr=new int[]{-3,1,2,-2,5,6};
////        int[] arr=new int[]{-30,-29,2,3,4,5,6};
////            int[] arr = new int[]{-5, 5, -5, 4};
//        System.out.println("MaxProductOfThree: "+maxProductOfThree.solution(arr));
        
//        int[] arr=new int[]{2,1,1,2,3,1};
//        Distinct distinct = new Distinct();
//        System.out.println("Distinct: "+distinct.solution(arr));
        
//        int[] arr=new int[]{0,1,0,1,1};
//        Distinct d=new Distinct();
//        System.out.println("Cars: "+d.solution(arr));
        
//        int[] arr=new int[]{0,1,0,1,1};
//        PassingCars cars = new PassingCars();
//        System.out.println("Cars: "+cars.solution(arr));
        
//        int[] arr=new int[]{4,1,3};
//        PermCheck check = new PermCheck();
//        System.out.println("Perm Check: "+check.solution(arr));
        
//        int[] arr=new int[]{1,3,1,4,2,3,5,4};
//        int X =5;
//        FrogRiverOne frogRiverOne = new FrogRiverOne();
//        System.out.println("Seconds: "+frogRiverOne.solution(X, arr));
//        int[] arr=new int[]{3,1,2,4,3};
//            int[] arr=new int[]{3,1};
//        TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
//        System.out.println("Difference: "+tapeEquilibrium.solution(arr));
        
//        PermMissingElem elem = new PermMissingElem();
//        int[] arr=new int[]{2, 3,5,4};
//        System.out.println("Missing number: "+elem.solution(arr));
        
        
        
//        FrogJmp frogJmp = new FrogJmp();
//        int val1=input.nextInt();
//        int val2=input.nextInt();
//        int val3=input.nextInt();
//        System.out.println("Steps: "+frogJmp.solution(val1, val2, val3));
        
        
        
//        System.out.println("Input A: ");
//        int val1=input.nextInt();
//        System.out.println("Input B: ");
//        int val2=input.nextInt();
//        ThreeLetters letters=new ThreeLetters();
//        System.out.println("ThreeLetters: "+letters.solution(val1, val2));
        
        
//        SparseBinaryDecomposition sp = new SparseBinaryDecomposition();
//        System.out.println("Solution is: "+sp.solution(val));

//        ParkingBill parkingBill = new ParkingBill();
//        System.out.println("Bill: "+parkingBill.solution("10:00", "23:00"));

//        ParityDegree parityDegree = new ParityDegree();
//        System.out.println("Power of 2 max Res: "+parityDegree.solution(val));
        
        
//        LongestPassword  longestPassword = new LongestPassword();
//        String str="test 5 a0vA pass507 ?xy1 sdfksdshffsdf234";
//        System.out.println("Result: "+longestPassword.solution(str));
//        
        
        
//        Scanner input = new Scanner(System.in);
//        TennisTournament tennisTournament = new TennisTournament();
//        int val1=0, val2=0;
//        while(val1!=-1){
//            System.out.println("Enter the value of P and Q: ");
//            val1=input.nextInt();
//            val2=input.nextInt();
//            System.out.println("Result: "+tennisTournament.solution(val1, val2));
//        }
        
        
        
        
        
        
//        Tree T20 = new Tree();
//        T20.x=20;
//        T20.l=null;
//        T20.r=null;
//        
//        Tree T21 = new Tree();
//        T21.x=21;
//        T21.l=null;
//        T21.r=null;
//        
//        Tree T1 = new Tree();
//        T1.x=1;
//        T1.l=null;
//        T1.r=null;
//        
//        Tree T3 = new Tree();
//        T3.x=3;
//        T3.l=T20;
//        T3.r=T21;
//        
//        Tree T10 = new Tree();
//        T10.x=10;
//        T10.l=T1;
//        T10.r=null;
//        
//        Tree T5 = new Tree();
//        T5.x=5;
//        T5.l=T3;
//        T5.r=T10;
//        TreeHeight h = new TreeHeight();
//        System.out.println("Tree height: "+h.solution(T5));
      

//        StrSymmetryPoint point = new StrSymmetryPoint();
//        String str="racecaraabaaracecar";
//        String str="rdfghjudolgjdflgdj";
//        System.out.println("StrSymmetryPoint: "+point.solution(str));
        
        
        
//        int[] list = new int[]{1, 4, 7, 3, 2, -1,5,5};
//        ArrListLen arr = new ArrListLen();
//        System.out.println("ArrListLen result: "+arr.solution(list));
        
//        int[] list = new int[]{4, 10, 5, 4, 2, 10,5,2};
//        FirstUnique firstUnique = new FirstUnique();
//        System.out.println("First Unique: "+firstUnique.solution(list));


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
