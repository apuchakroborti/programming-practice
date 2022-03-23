package programmingpractice;
public class ParkingBill {
     public int solution(String E, String L){
         String[] start=E.split(":");
         String[] end=L.split(":");
         int startMin=Integer.parseInt(start[1]);
         int endMin=Integer.parseInt(end[1]);
         
         int startH=Integer.parseInt(start[0]);
         int endH=Integer.parseInt(end[0]);
         int carry=0;
         int resMin=0;
         int resH=0;
         if((endMin-startMin)<0){
             carry=1;
             resMin=endMin-startMin+60;
         }else{
             resMin=endMin-startMin;
         }
         resH=endH-startH-carry;
         if(resMin>0) resH++;
         int bill=2;
         bill+=1*3;
         resH--;
         bill+=resH*4;
                  
         return bill;
     }
}
