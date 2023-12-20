/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week10;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.util.Random;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class T07Q01 {
 public static void main(String[] args) {
     
        Random r = new Random ();
        try {
            PrintWriter out = new PrintWriter (new FileOutputStream ("integer.txt"));
            for (int i = 0; i <10; i++){
                out.println(r.nextInt(1000+1));
            }
            out.close();
        }catch(IOException e){
            System.out.println("Problem with file output.");
        }
        
        try {
            BufferedReader in = new BufferedReader (new FileReader ("integer.txt"));
            String line = "";
            int max = Integer.MIN_VALUE;
            System.out.print("\nThe list = ");
            while ((line = in.readLine()) != null){
                int num = Integer.parseInt(line);
                if (num > max){
                    max = num;
                }
                System.out.print(num + " ");
            }
            System.out.print("\nThe largest integer = "+max);
        }catch (FileNotFoundException e){
            System.out.println("File was not found.");
        }catch (IOException e){
            System.out.println("Error reading from file.");
        }
            
        try {
            ObjectOutputStream out = new ObjectOutputStream (new FileOutputStream("integer.dat"));
            for (int i = 0; i <10 ; i++){
                out.writeInt(r.nextInt(1001));
            }
            out.close();
        }catch(IOException e){
            System.out.println("Problem with file output.");
    }
        int n = 0;
        int total = 0;
        try{
            ObjectInputStream in = new ObjectInputStream (new FileInputStream ("integer.dat"));
            int num;
            System.out.print("\nThe list = ");
            while (true){
            System.out.print((num = in.readInt()) + " ");
            total += num;
            n++;
            }
            }catch(EOFException e){
            System.out.println("\nAverage = "+ (total/n));
        }catch (IOException e){
            System.out.println("Problem with file input.");
        }
}
}

    

