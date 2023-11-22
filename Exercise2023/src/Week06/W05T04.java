/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week06;

import java.util.Scanner;

/**
 *
 * @author pensyarah
 */
public class W05T04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // TODO code application logic here
//        String[] sentence  = {"the cat in the hat", "likes the theater", "but not the mouse"};
        Scanner scan = new Scanner(System.in);
        System.out.print("Insert number of sentences that you wish to write: ");
        int y = scan.nextInt();
        scan.nextLine(); // Consume the newline character
        String[] sentence = new String[y];
        
        for(int i =0;i<sentence.length;i++){
            System.out.print("Insert the "+(i+1)+" sentence:");
            sentence[i] = scan.nextLine();
        }
        int counter=0;  
        for(String words: sentence){
            String[] word = words.split("\\s+"); // string boleh displitkan dan terus masuk ke array
            for(String x:word){
               if(x.equals("the")){
                   counter++;
               }
            }
        }
        System.out.println(counter);
    }
    
}
