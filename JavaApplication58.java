/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication58;

import java.util.Scanner;

/**
 *
 * @author STUDENT
 */
public class JavaApplication58 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.print(" enter your Month  ");
         
        Scanner input = new Scanner(System.in);

        int Num = input.nextInt();
        
        switch(Num) {
            case 12:
            case 1:
            case 2:
            
               System.out.print(" Winter  "); 
        break;
            case 3:
            case 4:
            case 5:
                  System.out.print(" spring  "); 
                break;
            case 6:
            case 7:
            case 8:
                
                 System.out.print(" summer  "); 
                break;
                
            case 9:
            case 10: 
            case 11:
                System.out.print(" Fall  "); 
                break;
                
                default:
                System.out.print(" Invalid please enter your Month  "); 
                break;
     
                
        
        }
       
    }
    
}
