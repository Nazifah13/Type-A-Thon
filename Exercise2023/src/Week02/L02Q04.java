/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week02;

import java.util.Scanner;
/**
 *
 * @author pensyarah
 */
public class L02Q04 {

    /**
     * @param args the command line arguments
     * 1. Get input from user
     * 2. input/3600
     * 3. Use the remainder and /60 to minute 
     * 4. rem as second;
     */
    public static void main(String[] args) {
        
        Scanner something = new Scanner(System.in);
        
        int input, hour, minute, second;
        
        System.out.print("Enter the number of seconds: ");
        input = something.nextInt();
      /**
       * System.out.print(input + " seconds is ");
       * hour = input/3600;
       * System.out.print(hour + " hours,");
       * minute = (input%3600)/60;
       * System.out.print(minute + " minutes and ");
       * second = input%60;
       * System.out.println(second + " seconds,");
        * System.out.println(input + " seconds is " + hour + " hour, " + minute + " minutes and " + second + " seconds");
    **/
          System.out.println(input + " seconds is " + input/3600 + " hour, " + (input%3600)/60 + " minutes and " + input%60 + " seconds");
     }
    
}
