/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication60;

import java.util.Scanner;

/**
 *
 * @author STUDENT
 */
public class JavaApplication60 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          System.out.print(" enter postive number  ");
         
        Scanner input = new Scanner(System.in);
int max= 0;
int num;
num=input.nextInt();
while(num!=0){       
    
    
    if (num > max)
       max=num;
    }
      System.out.print(" enter 0 to stop  ");
      num=input.nextInt();
   

System.out.print(" the largest number is   " + max);
    
}
}