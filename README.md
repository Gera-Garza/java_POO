# General info
This is the repository for the course of Java_POO with Platzi, here you will see what I consider to be the most used topics and some examples.

## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [Setup](#setup)
* [Summary](#summary)
> * [Classes](#classes)
> * [Abstraction](#abstraction)
> * [Encapsulation](#encapsulation)
> * [Inheritance](#inheritance)
> * [Polymorphism](#polymorphism)
> * [Abstract_Class](#abstract_class)
> * [Interfaces](#interfaces)	
## Technologies
Project is created with:
* IntelliJ IDEA
> * With openJDK 1.8 

	
## Setup
Install [IntelliJ](https://www.jetbrains.com/es-es/idea/download/#section=windows) in your computer.

Then in the extensions tab search for **Java Extension Pack** and install it.

Start your proyect creating your files with **.java**  

## Summary
In this course talk about all what can be done and some benefits from using Object Oriented Programming, they mention what is a class, what is an object, and some core 
ideas like Abstraction, Encapsulation, Inheritance and Polymorphism, I will explain a little bit of those now.

### Classes
> **Classes** A class is the model that you define to create objects it contains, an identifier, properties and methods.
```java
public class Main {
    public static void main(String[] args) {
        showMenu();
    }//end of main
}//end of Main class
```
### Abstraction
An abstraction is when you recognize that you need a specific properties that you will used repeatedly in your code, so you abstract them and create a class
```java
public abstract class User {
    private int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
```

### Encapsulation
To encapsulate a class is when you protect your variables/properties and control how has access to them with the private/protect/public/default options
> Also is important to know that you will need to create the getters and setters to acces those properties
 ```java
public class Doctor{
    //Atributo
    private String speciality;
    private ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    public Doctor(String name, String email){
        super(name,email);
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }



    public void addAvailableAppointment(String date, String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date,time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }
 }
```
### Inheritance
Having inheritance it is very useful to write less code becuase you know that several classes used common properties or methods and there si when you used Inheritance
 ```java
public class Nurse extends User{
    private String speciality;

    public Nurse(String name, String email){
        super(name,email);
    }

    @Override
    public void showDataUser() {
        System.out.println("Empleado del hospital: Cruz verde");
        System.out.println("Departamentos: Nutriologia, Pediatria");
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
```
### Plymorphism
Polymophism is when you re define what a method can do, it is commonly used when you have an abstract class and you whant to inherit some properties and methods 
but depending on what you want your class to do then you **Ovverride** that method
 ```java
public class Doctor extends User {
    //Atributo
    private String speciality;
    private ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    public Doctor(String name, String email){
        super(name,email);
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }



    public void addAvailableAppointment(String date, String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date,time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpeciality: " + speciality + "\nAvailable: " + availableAppointments.toString();
    }

    @Override
    public void showDataUser() {
        System.out.println("Empleado del Hospital: CRuz Roja");
        System.out.println("Departamento: Cancerología");
    }
}
```

### Abstract_Class
The abstract class is for when you know that there will be no instances of that class you only used it to inherit properties or methdos
 ```java
public abstract class User {
    private int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
```
### Interfaces
The interfaces are similar to abstract classes but they don't have the same limitations like only having only 1 "parent" and they could be implemented in any class, it is normally used to control other clases or add/share a common method between classes 
 ```java
public interface IScheduleable {
    void schedule(Date date, String time);
}
```
