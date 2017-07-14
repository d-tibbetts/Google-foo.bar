/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bunny_prisoner_locating;

import java.math.BigInteger;

/**
 *
 * @author Denee Tibbetts
 */
public class Bunny_prisoner_locating {

  public static String answer(int x, int y)
  {
      int bunny_ID;
      int n = x+y;
      BigInteger k,j,r,c,p;
      if(x<1 || y<1 || x>100000 || y>100000)
      {
          return Integer.toString(0);
      }
      else
      {
         k = BigInteger.valueOf(n); //n
         j =BigInteger.valueOf(n-1);//n-1
         r = k.multiply(j);//n*n-1
         c = r.divide(BigInteger.valueOf(2));//(n*(n-1))/2
         p = c.subtract(BigInteger.valueOf(y-1)); //(n*(n-1))/2 -y-1
         //p.toString();
         //bunny_ID = p.intValue();
           
//         n = (n*(n-1))/2;
//         bunny_ID = n - (y-1);
//         bunny_ID = ((n*(n-1))/2)-(y-1);
      }
      return p.toString();
  }
    public static void main(String[] args) {
       String ID;
       int x, y;
       
       for( x = 1; x< 100000; x++){
           for( y =1; y<100000; y++){
               System.out.println("("+x+", "+y+"):"+answer(x,y));
               
           }
       }
    }
    
}
