/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week06;

/**
 *
 * @author pensyarah
 */
public class W05Q05 {

    /**
     * @param args the command line arguments
     */
    
    private static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }
     
    public static void main(String[] args) {
        // TODO code application logic here
          String[] sentence = {"This", "is", "a", "sample", "sentence", "hello"};

        // Display the array in reverse order with each string element reversed
        for (int i = sentence.length - 1; i >= 0; i--) {
            String reversedWord = reverseString(sentence[i]);
            System.out.println(reversedWord);
    }
    }
    
}
