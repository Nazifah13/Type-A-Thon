/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week10;

/**
 *
 * @author pensyarah
 */
public class Digit {
    
    int num;
    
    Digit(int num){
        this.num = num;
    }
    
    public int digitMultiplication(){
        int product = 1;
        
        while(num!=0){
            product *= num%10;
            num/=10;
        }
        return product;
    }
    
    public void displayMultiply(){
        System.out.println("The product of digits of " + num + " is " + digitMultiplication());
    }
}
    

