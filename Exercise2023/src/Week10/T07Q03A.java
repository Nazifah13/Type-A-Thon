/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week10;

/**
 *
 * @author pensyarah
 */
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class T07Q03A {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a sentence:");
        String sentence=scan.nextLine();
       char []x=sentence.toCharArray();
       String [] bi= new String [x.length];
        for (int i = 0; i < x.length; i++) {
            
            int ascii= (int)x[i];
            bi [i]= String.format("%8s", Integer.toBinaryString(ascii)).replace(' ','0');
        }
        try {
   PrintWriter outputStream = new PrintWriter(new FileOutputStream("data.txt"));
            for (int i = 0; i <bi.length; i++) {
                outputStream.println(bi[i]);
            }
   outputStream.close();
} catch (IOException e) {
   System.out.println("Problem with file output"); 

    }
        int k=0;
        try {
   Scanner inputStream = new Scanner(new FileInputStream("data.txt"));
  while(inputStream.hasNextLine()){
      bi[k]=inputStream.nextLine();
      k++;
  }
      
   inputStream.close();
} catch (FileNotFoundException e) {
   System.out.println("File was not found"); 
}
        for (int i = 0; i < bi.length; i++) {
            // Parse the binary string to an integer
       int num = Integer.parseInt(bi[i], 2);
        x[i]=(char)num;
            System.out.print(x[i]);
        }
    }
}