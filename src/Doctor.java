import javax.print.Doc;

public class Doctor {
    //Atributes
    static int id = 0; //autoincrement
    String name;
    String email;
    String speciality;


    //Constructor
    Doctor(){
        System.out.println("Creating the object Doctor");
    }

    Doctor(String name, String speciality){
        System.out.println("The doctor's name is: "+ name);
        id++;
        this.name = name;
        this.speciality = speciality;
    }

    //Methods
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("ID Doctor: " + id);
    }

}
