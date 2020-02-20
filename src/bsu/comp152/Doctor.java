package bsu.comp152;

public class Doctor {
    protected String AlmaMater;
    private double fee;

    public void treatPatient(Patient patient){
        System.out.println("Take two of these and call me if symtoms persist " + patient.getName());
    }

    public double billPatient(Patient unwellPerson){
        System.out.println(" Patient " + unwellPerson.getName() + " has to pay " + fee);
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
