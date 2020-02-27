package bsu.comp152;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        var allDoctors = new ArrayList<Doctor>();
        var doc = new Doctor("New England Univ", 200);
        var surg = new Surgeon("Local Hospital");
        var doc2 = new Doctor("Fancy Name Brand Univ", 2000);
        allDoctors.add(doc);
        allDoctors.add(surg);
        allDoctors.add(doc2);
        var sickPerson = new Patient("Ed 'I shoulda got the shot' Smith");
        var doc4 = new Doctor("Fancy Surgery School", 1000);
        if(doc4.equals(surg))
            System.out.println("They were the same!!!!!!");
        else
            System.out.println("???? NOT THE SAME??????");
//       for( var onCallDoc : allDoctors){
//           System.out.println("+++++++++++++++++++++New Doctor now +++++++++++++");
//           System.out.println(onCallDoc);
//           onCallDoc.treatPatient(sickPerson);
//           onCallDoc.billPatient(sickPerson);
//       }

    }
}
