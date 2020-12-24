/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Seif
 */
public class Patient extends Person{
    private String Disease;
    public Patient(String Name,String ID,String Address,int Age,String[] phoneNumber,String Email,String Disease){
        super(Name, ID, Address, Age, phoneNumber, Email);
        this.Disease=Disease;
    }
}
