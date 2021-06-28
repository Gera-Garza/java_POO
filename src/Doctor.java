import javax.print.Doc;

public class Doctor {
    //Atributes
    static int id = 0; //autoincrement
    String name;
    String speciality;


    //Constructor
    Doctor(){
        System.out.println("Creating the object Doctor");
        id++;
    }

    Doctor(String name){
        System.out.println("The doctor's name is: "+ name);
    }

    //Methods
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("ID Doctor: " + id);
    }

}
