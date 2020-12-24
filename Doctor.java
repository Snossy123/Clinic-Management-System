/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Seif
 */
public class Doctor extends Person implements User{
    private float Salary;
    private final String Specialization;
    private String Password;
    public Doctor(String Name,String ID,String Address,int Age,String[] phoneNumber,String Email,float Salary,String Specialization,String Password){
        super(Name,ID,Address,Age,phoneNumber,Email);
        this.Salary=Salary;
        this.Specialization=Specialization;
        this.Password=Password;
    }
    public float getSalary(){
        return this.Salary;
    }
    public void setSalary(float Salary){
        this.Salary=Salary;
    }
    public String getSpecialization(){
        return this.Specialization;
    }

    @Override
    public void ChangePassword(String userOldPassword, String userNewPassword) {
        if(userOldPassword.equals(this.Password)){
            this.Password=userNewPassword;
        }
    }

    @Override
    public void logout() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
