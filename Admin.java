/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Seif
 */
public class Admin extends Person implements User {
    private String Salary;
    private String Password;
    
    public Admin(String Name,String ID,String Address,int Age,String[] phoneNumber,String Email,String Salary,String Password){
        super( Name, ID, Address, Age, phoneNumber, Email);
        this.Salary=Salary;
        this.Password=Password;
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
