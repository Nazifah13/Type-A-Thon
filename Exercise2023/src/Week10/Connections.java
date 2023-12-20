/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week10;

/**
 *
 * @author pensyarah
 */
public class Connections {
    private int numOfConnections;

    public Connections() {
        this.numOfConnections = 1;
    }
    
    public void Disconnected(){
        System.out.println("Disconnected");
        this.Display();
    }

    public void setNumOfConnections(int numOfConnections) {
        this.numOfConnections += numOfConnections;
    }
    public void Connect(){
        this.numOfConnections++;
    }
    
    public void Display(){
        System.out.println("Number of connections : " + this.numOfConnections);
    }
    
            
}
