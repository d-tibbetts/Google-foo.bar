/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuel_injection_perfection;

import java.math.BigInteger;

public class Fuel_injection_perfection {

    public static int answer(String n)
    { 
        BigInteger fuel_pellets;
        BigInteger two = BigInteger.valueOf(2);
        System.out.println("Two: "+two);
        
        int count =0;
        try{
            fuel_pellets = new BigInteger(n);
            
        }
        catch(NumberFormatException e){
            return 0;
        }
        System.out.println("Fuel Pellets: "+fuel_pellets);
        while(fuel_pellets.compareTo(BigInteger.ONE) != 0)
        {
            System.out.println("Fuel Pellets: "+fuel_pellets);
            BigInteger firstVal = fuel_pellets.add(BigInteger.ONE);
            firstVal = firstVal.and(fuel_pellets);
            BigInteger secondVal = fuel_pellets.subtract(BigInteger.ONE);
            secondVal = secondVal.and(fuel_pellets.subtract(two));
            boolean bit = fuel_pellets.testBit(0);
            System.out.println("Boolean Value of "+ fuel_pellets +" is :"+ fuel_pellets.toString(2));
            System.out.println("Boolean Bit:" + bit);
            if(bit == false) {
                fuel_pellets = fuel_pellets.shiftRight(1);
                System.out.println("Shifting Fuel Pellets: "+fuel_pellets);
                
                count++;
                System.out.println("Count: "+ count);
            } 
            else if(firstVal.compareTo(secondVal) == 1 || fuel_pellets.intValue()==3)
            {       
                System.out.println("Comparing firstVal to Second Val: "+firstVal.compareTo(secondVal)+" VS 1");
                fuel_pellets = fuel_pellets.subtract(BigInteger.ONE);
                System.out.println("fuel Pellets: "+fuel_pellets);
                count++;
                System.out.println("Count = "+count);
            
            }
            else
            {
                fuel_pellets = fuel_pellets.add(BigInteger.ONE);
                System.out.println("fuel Pellets: "+fuel_pellets);
                count++;
                System.out.println("Count = "+count);
                
            }
               
        
            
            
        }
        System.out.println();
        System.out.println();
        System.out.println("Final Count: "+count);
        return count;
       
    }
    public static void main(String[] args) {
       System.out.println(answer("11111111111111111111")); 
       // System.out.println(answer("4"));
        //System.out.println(answer("15"));
        //System.out.println(answer("13"));
        //System.out.println(answer("9"));
        // TODO code application logic here
    }
    
}
