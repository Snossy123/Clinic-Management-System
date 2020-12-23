
package clinic;

    public class Receptionist extends Person{     
        private static int token_id =0;
          
    public Receptionist(int person_id, String person_name, String person_address, String person_mobile, String user_name, String user_password) {
    super(person_id, person_name, person_address,person_mobile, user_name, user_password);
}

    //price of medicine
    public void Medicine_price(Patient patient, float medicine) {
        patient.setMedicine_price(medicine);
    }


    //cost
    public void DishargePatient(Patient patient) {
        patient.setCost(patient.getBed_cost() * patient.getNumber_residency_days() + patient.getResources_charges());
    }
   
    //add patient
    protected void add_Patient(Patient patient){ 

    }

   //create token id
    public void createTokenId(Patient client){
          client.setToken_id(token_id++);
    }  

    public void Resources_charges(Patient patient, float Resources_charges){
          patient.setResources_charges(Resources_charges);
      }
    
    //date of visit doctor
    public void takeDate(Patient p, String date){
        p.setDate(date);
    }

    //view token inline
     public void viewTokenInline(){
         //read from database last patients who token id and display them by array
     }
     /*public  Patient viewPatient(){
         return Patient;
     }*/
     
    public void viewPrescription(Patient patient){
        patient.viewprescription();
    }
  }
