/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week06;

import java.util.Random;

/**
 *
 * @author pensyarah
 */
public class W05T06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random r = new Random();
        int num = 31;
        System.out.println("The number is : " + num);
        int [] binary = new int [8];
        for(int i=7;i>=0;i--){
        binary[i]=num%2;
        num=num/2;
        }
        for( int i=0; i<binary.length;i++){
                        System.out.print(binary[i]);
        }
            }
    
}
