package bsu.comp152;

public class Surgeon extends Doctor {
    private String hospital;

    public Surgeon(String HospitalName){
        //this is not code
        super("Fancy Surgery School", 1000);
        hospital = HospitalName;
    }

    @Override
    public String toString(){
        return "Surgeon operating out of " + hospital + " who went to " +AlmaMater;
    }

    @Override
    public void treatPatient(Patient patient) {
       System.out.println("Now about the slice and dice "+ patient.getName() + " in " + hospital);
        super.treatPatient(patient);
    }
}
