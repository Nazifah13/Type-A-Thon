/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week10;

/**
 *
 * @author pensyarah
 */
public class Dimension {
    
    private double x,y;

    public Dimension(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Dimension() {
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public void display(){
        System.out.println("X coor:" + this.x);
        System.out.println("Y coor = " + this.y);
    }
    
}
