import com.sun.org.apache.xml.internal.security.utils.DOMNamespaceContext;

import static ui.UIMenu.*;

public class Main {

    public static void main(String[] args) {
        showMenu();

        Doctor myDoctor = new Doctor("Gerardo Garza", "Pediatria");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        Patient patient = new Patient("Alejandra", "alejandra@mail.com");



    }//end of main

}//end of Main class
