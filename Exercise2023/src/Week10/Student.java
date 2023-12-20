/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week10;

/**
 *
 * @author pensyarah
 */
public class Student {
    private String contact;

    public Student(String contact) {
        this.contact = contact;
    }

    public Student() {
        this.contact = null;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    
    public void display() {
        System.out.println (this.contact);
}
    
}
