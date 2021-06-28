import model.Doctor;
import model.Patient;
import model.User;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        //showMenu();

        Doctor myDoctor = new Doctor("Gerardo Garza", "Pediatria");

        Patient patient = new Patient("Alejandra", "alejandra@mail.com");

        myDoctor.addAvailableAppointment(new Date(),"4pm");
        myDoctor.addAvailableAppointment(new Date(),"10am");
        myDoctor.addAvailableAppointment(new Date(),"1pm");

        //System.out.println(myDoctor);

        /*for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }*/

        User user = new Doctor("Anahi", "ana@ana.com");
        user.showDataUser();

        User userPa = new Patient("Karla","karla@karla.com");
        userPa.showDataUser();

        User user1 = new User("Gerardo","gerardo@gerardo.com") {
            @Override
            public void showDataUser() {
                System.out.println("\nDoctor " +getName());
                System.out.println("Hospital: cruz verde");
                System.out.println("Despartamento: Geriatria");
            }
        };

        user1.showDataUser();

        System.out.println();
        System.out.println();
        System.out.println(patient);


    }//end of main

}//end of Main class
