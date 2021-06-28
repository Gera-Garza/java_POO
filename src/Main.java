import com.sun.org.apache.xml.internal.security.utils.DOMNamespaceContext;

import java.util.Date;

import static ui.UIMenu.*;

public class Main {

    public static void main(String[] args) {
        showMenu();

        Doctor myDoctor = new Doctor("Gerardo Garza", "Pediatria");

        Patient patient = new Patient("Alejandra", "alejandra@mail.com");

        myDoctor.addAvailableAppointment(new Date(),"4pm");
        myDoctor.addAvailableAppointment(new Date(),"10am");
        myDoctor.addAvailableAppointment(new Date(),"1pm");

        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }


    }//end of main

}//end of Main class
