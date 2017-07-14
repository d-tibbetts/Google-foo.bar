/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lovely_lucky_lambs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lovely_Lucky_Lambs {
   public static int answer(int total_lambs){
       
       int max_Henchmen=0, min_Henchmen=0;
       int counter = 0,lambs_Spent = 0, x =1;
       int max_lamb_Leftovers = 0, min_lamb_Leftovers = 0;
       List<Integer> max_payOuts = new ArrayList<Integer>();
       List<Integer> min_payOuts = new ArrayList<Integer>();
       
       int[] fibonnaci_array = new int[50];
       fibonnaci_array[0] = 1;
       fibonnaci_array[1] = 1;
       for(int i= 2; i < fibonnaci_array.length; i++ )
       {
           fibonnaci_array[i]= fibonnaci_array[i-1]+ fibonnaci_array[i-2];
       }
       
       if(total_lambs < 10 || total_lambs > Math.pow((double)10, (double)9))
       {
           return 0;
       }
       else
       {
           
           //Maximum number of henchment
           while(true)
           {
               lambs_Spent =  lambs_Spent + x;
               if(lambs_Spent <= total_lambs)
               {
                   max_lamb_Leftovers = total_lambs - lambs_Spent;
                   max_Henchmen++;
                   max_payOuts.add(x);
                   
                   x =  x*2;
               }
               else
               {
                   if(max_lamb_Leftovers >= (max_payOuts.get(max_payOuts.size() -1) + max_payOuts.get(max_payOuts.size()-2)))
                   {
                       max_Henchmen++;
                       max_payOuts.add(max_lamb_Leftovers);
                   }
                   
                   break;
               }
           }
           
           
           //Minimum number of henchmen
           lambs_Spent = 0;
           min_lamb_Leftovers = 0;
           for(int i =0; i < fibonnaci_array.length; i++){
               lambs_Spent = lambs_Spent + fibonnaci_array[i];
               if(lambs_Spent <= total_lambs){
                   min_lamb_Leftovers = total_lambs - lambs_Spent;
                   min_payOuts.add(fibonnaci_array[i]);
                   min_Henchmen++;
               }
               else{
//                    if(lamb_Leftovers >= (min_payOuts.get(min_payOuts.size() -1) + min_payOuts.get(max_payOuts.size()-2)))
//                   {
//                       min_Henchmen++;
//                   }
                   break;
               }
           }
           
          
       }
      
//      System.out.println("Total Lambs ="+ total_lambs);
//      System.out.println("max_Henchmen: "+ max_Henchmen);
//      System.out.println(Arrays.toString(max_payOuts.toArray()));
//      System.out.println("Max Left overs: "+max_lamb_Leftovers);
//      System.out.println("min_Henchmen: "+ min_Henchmen);
//      System.out.println(Arrays.toString(min_payOuts.toArray()));
//      System.out.println("Min Left overs: "+min_lamb_Leftovers);
//      System.out.println("Returning : " + Math.abs((max_Henchmen - min_Henchmen)));
//      System.out.println();
//      System.out.println();
        return Math.abs((max_Henchmen - min_Henchmen));
    }
    public static void main(String[] args) {
        
        
        answer(35);
//        for(int i = 10; i < 200; i++){
//            answer(i);
//        }
    }
    
}
