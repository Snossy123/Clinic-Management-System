/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Seif
 */
public abstract class Person {

    private final String Name;
    private final String ID;
    private String Address;
    private String Email;
    private String[] phoneNumber;
    private int Age;
    
    public Person(String Name,String ID,String Address,int Age,String[] phoneNumber,String Email){
        this.Name=Name;
        this.ID=ID;
        this.Address=Address;
        this.Age=Age;
        this.phoneNumber[0]=phoneNumber[0];
        this.phoneNumber[1]=phoneNumber[1];
        this.Email=Email;
    }
    public String getName() {
        return Name;
    }

    public String getID() {
        return ID;
    }
    public String getAddress() {
        return Address;
    }
    public void setAddress(String Address){
        this.Address=Address;
    }
    public int getAge() {
        return Age;
    }
    public void setAge(int Age){
        this.Age=Age;
    }
    public String[] getPhoneNumber(){
        return this.phoneNumber;
    }
    public void setPhoneNumber(String[] phoneNumber){
        this.phoneNumber[0]=phoneNumber[0];
        this.phoneNumber[1]=phoneNumber[1];
    }
    public String getEmail(){
        return this.Email;
    }
    public void setEmail(String Email){
        this.Email=Email;
    }

}
