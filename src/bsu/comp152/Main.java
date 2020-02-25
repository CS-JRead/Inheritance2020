package bsu.comp152;

public class Main {

    public static void main(String[] args) {
            var doc = new Doctor();
            var surg = new Surgeon();
            var sickPerson = new Patient("Ed 'I shoulda got the shot' Smith");
            doc.treatPatient(sickPerson);
            doc.billPatient(sickPerson);
            surg.treatPatient(sickPerson);
            surg.billPatient(sickPerson);

    }
}
