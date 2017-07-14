/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solar_doomsday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solar_doomsday {

    public static int[] answer(int area){
        int x = area;
        double root,floor;
        List <Integer> answers = new ArrayList<Integer>();
        
        
        while(x > 0)
        {
           //System.out.println("X = "+x);
           //get the root of x (initially == area)
           root = Math.sqrt(x); 
           //take the floor of the answer 
           floor = Math.floor(root);
           //add the floor squared to the list of panels
           answers.add((int)Math.pow(floor,2));
           //subtract the value from the initial value 
           x = x-(int)Math.pow(floor,2);
        }
        
        int listCount = answers.size();
        int[] answersArray = new int[listCount];
        
        for(int i =0; i < answersArray.length;i++)
        {
          
           int something = answers.get(i);
           answersArray[i] = something;
           
        }
       
        return answersArray;
    }
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       
       System.out.println("Enter the area: ");
       int i = in.nextInt();
       
       int[] theResults = answer(i);
       System.out.print("[");
       for(int j = 0; j < theResults.length; j++){
           System.out.print(theResults[j]+", ");
       }
       System.out.print("]");
    }
    
}
