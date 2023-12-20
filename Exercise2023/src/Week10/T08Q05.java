/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week10;

/**
 *
 * @author pensyarah
 */
public class T08Q05 {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Connections obj = new Connections();
        obj.Connect();
        obj.setNumOfConnections(10);
        obj.Connect();
        obj.Connect();
        obj.Connect();
        obj.Disconnected();
        // TODO code application logic here
    }
    
}
