/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic;

/**
 *
 * @author Alkhtat
 */
public class Doctor extends Person {

    public Doctor(int person_id, String person_name, String person_address, String person_mobile, String user_name, String user_password) {
        super(person_id, person_name, person_address, person_mobile, user_name, user_password);
    }

    public void Describe_medicine(Patient patient, String medicine){
        patient.setDescribe_medicine(medicine);
        patient.reset_token_id();
    }
    
    public void Write_disease(Patient patient, String disease){
        patient.set_disease(disease);
    }
    
    public void need_bed(Patient patient, Boolean bed){
        patient.setNeed_bed(bed);
    }
    
    public void Number_residency_days(Patient patient, int Number_residency_days){
        patient.setNumber_residency_days(Number_residency_days);
    }
     //veiw patient inline
    public void viewpatient() {
        
    }   
    
    
}
