# General info
This is the repository for the course of Java_POO with Platzi, here you will see what I consider to be the most used topics and some examples.

## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [Setup](#setup)
* [Summary](#summary)
> * [Classes](#classes)
> * [Variables](#variables)
> * [Loops](#loops)
> * [Conditionals](#conditionals)
	
## Technologies
Project is created with:
* IntelliJ IDEA
> * With openJDK 1.8 

	
## Setup
Install [IntelliJ](https://www.jetbrains.com/es-es/idea/download/#section=windows) in your computer.

Then in the extensions tab search for **Java Extension Pack** and install it.

Start your proyect creating your files with **.java**  

## Summary
In this course we see how to create a class, how to define and fill variables, the diferent loops like for loop or while loop, also some condicionals like **==** 
or **>=**, **<=** and many others, and this is just a very general idea of how the course is.

### Classes
> **TIP**: For the program to recognice what to run is neccesary the **main** function
```java
public class holamundo {
    public static void main(String[] args) {
        System.out.println("hola mundo");
    }
}
```
### Variables
So there is so many different kinds of variables and how to declare it so here are some examples:
```java
public class Variables {
    public static void main(String[] args) {
        //declarando una variable
        int speed;
        //asignando un valor a la variable
        speed = 10;
        System.out.println(speed);
        
}
```
> Here are some examples of how you can declare arrays
 ```java
 String androidVersions[] = new String[17];
        String[] days = new String[7];

        String cities[][] = new String[4][2];
        int numbers[][][] = new int[1][2][3];
        int numbers4[][][][] = new int[2][2][2][2];

        androidVersions[0]= "Apple Pie";
        androidVersions[1]= "Bannana Bread";
        androidVersions[2]= "Cupcake";
        androidVersions[3]= "Donut";
}
```
### Loops
So there are 2 principal kinds of loops,they have some variations but they are the principals: **For** loops and **While** loops here are some examples:
 ```java
 public class SosSignal {
  static  boolean isTurnOnLigth = false;

    public static void main(String[] args) {
        turnOnOffLigth();

        for (int i = 1; i <= 10; i++) {
            printSOS();
        }
        
        //Here is the while
        int i=0;
        while(i<10){
            printSOS();
        }
    }

    public static void printSOS(){
        System.out.println(". . . _ _ _ . . .");
    }

    public static boolean turnOnOffLigth() {
        isTurnOnLigth = (isTurnOnLigth)?false:true;
        return isTurnOnLigth;
    }
}
```
### Conditionals
The condicionals are the boolean results of comparing some values or variables, here are some examples:
 ```java
public class LogicOperations {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;

        //operadores de comparacion
        System.out.println("a es igual a b? -> "+ (a==b));
        System.out.println("a es diferente de b? -> "+ (a!=b));

        //operadores de relacion
        System.out.println("a es mayor a b? -> "+ (a>b));
        System.out.println("a es menor de b? -> "+ (a<b));
        System.out.println("a es mayor o igual a b? -> "+ (a>=b));
        System.out.println("a es menor o igual de b? -> "+ (a<=b));

        if(a == b){
            System.out.println("a es igual a b? -> "+ (a==b));
        }else if(a != b){
            System.out.println("a es diferente de b? -> "+ (a!=b));
        }else if(a > b){
            System.out.println("a es mayor a b? -> "+ (a>b));
        }else if(a < b){
            System.out.println("a es menor de b? -> "+ (a<b));
        }
    }
}
```
