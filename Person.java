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
    private String mobile;
   
    
    public Person(String Name,String ID,String Address ,String mobile,String Email){
        this.Name=Name;
        this.ID=ID;
        this.Address=Address;
        this.mobile=mobile;
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    
     
    public String getEmail(){
        return this.Email;
    }
    public void setEmail(String Email){
        this.Email=Email;
    }

}
