/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication63;

import java.util.Scanner;


public class JavaApplication63 {

   
    public static void main(String[] args) {
          System.out.print(" enter a number  ");
         
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int count =0;
        for (int i =1; i<=num; i++){
            if (num %i ==0){
                count++;
            }
        }
      if (count ==2){
          System.out.print(" prime number  ");
      }  
      else {
          System.out.print(" not a prime number  ");
      }
        
    }
    
}
