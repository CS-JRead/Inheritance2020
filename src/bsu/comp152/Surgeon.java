package bsu.comp152;

public class Surgeon extends Doctor {
    private String hospital;


    public void treatPatient(Patient patient) {
       System.out.println("Now about the slice and dice "+ patient.getName() + " in " + hospital);
    }
}
