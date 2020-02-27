package bsu.comp152;

public class Doctor {
    protected String AlmaMater;
    private double fee;

    public Doctor(String medSchool, double visitCost){
        AlmaMater = medSchool;
        fee = visitCost;
    }

    @Override
    public String toString(){
        return "Doctor who went to " + AlmaMater + " who charges "+ fee;
    }

    @Override
    public boolean equals(Object other){
        if ( !(other instanceof Doctor))
            return false;
        var otherDoctor = (Doctor)other;
        //fix this
    }

    public void treatPatient(Patient patient){
        System.out.println("Take two of these and call me if symtoms persist " + patient.getName());
    }

    public double billPatient(Patient unwellPerson){
        System.out.println(" Patient " + unwellPerson.getName() + " has to pay $" + fee);
        return fee;
    }

    public double billPatient(boolean medicarePatient, GovernmentProgram govProgram){
        var billingAmount = fee;
        if (medicarePatient)
            billingAmount = billingAmount*.75;
        System.out.println("Billing Government program "+ billingAmount);
        return billingAmount;
    }
}
