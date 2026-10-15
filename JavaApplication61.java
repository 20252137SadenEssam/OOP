

package javaapplication61;

import java.util.Scanner;

/**
 *
 * @author STUDENT
 */
public class JavaApplication61 {

    
    public static void main(String[] args) {
         System.out.print(" enter your intger n ");
         
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        
        for(int row=1; row<=N; row++){
            for (int coloum=1; coloum<=row; coloum++){
               System.out.print(coloum);
            }
            System.out.println();
        }
        
    }
    
}
