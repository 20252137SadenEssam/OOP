/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication57;


import java.util.Scanner;

public class JavaApplication57 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.print(" enter your numbers  ");
         
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
       

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.print(" its divisable by both 3 and 5");

        } else if (num % 3 == 0) {
            System.out.print(" its divisable by 3");
            
        } else if (num % 5 == 0) {
            System.out.print(" its divisable by 3");
        } else {
            System.out.print(" its not divisable");

        }

    }

}
