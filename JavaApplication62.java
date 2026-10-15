/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication62;

import java.util.Scanner;

/**
 *
 * @author STUDENT
 */
public class JavaApplication62 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         System.out.print(" enter your intger  ");
         
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int reversed =0;
        
        while (number !=0){
            int LastDigit = number %10;
            reversed= reversed *10+LastDigit;
            number = number/10;
        }
        
        System.out.println(" your reversed number :  "+ reversed);
    }
    
}
