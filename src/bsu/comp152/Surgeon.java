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
    public boolean equals(Object other){
        if ( !(other instanceof Surgeon))
            return false;
        Surgeon otherDoctor = (Surgeon)other;
        boolean isSchoolSame = this.AlmaMater.equals(otherDoctor.AlmaMater);
        return isSchoolSame && this.hospital.equals(otherDoctor.hospital);
    }

    @Override
    public void treatPatient(Patient patient) {
       System.out.println("Now about the slice and dice "+ patient.getName() + " in " + hospital);
        super.treatPatient(patient);
    }
}
