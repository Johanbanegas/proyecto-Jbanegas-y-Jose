/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyect;

import java.util.Scanner;

/**
 *
 * @author Xande
 */
public class Proyect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre="a";
        String apellidos="A";
        String nombrePadre="a";
        String apellidosPadre="A";
       int edad=0;
       int edadPadre=0;
       String grado="a";
       String correo="a";
       String celular="a";
       String direccion="a";
      Scanner sc=new Scanner(System.in);

       
//inicio de la plataforma
System.out.println("-----------PLATAFORMA DE INGRESO DE DATOS-----------");
        System.out.println("Ingrese el primer y segundo nombre del alumno");
    nombre=sc.nextLine();
        System.out.println("Ingrese los apellidos del alumno");
        apellidos=sc.nextLine();
        System.out.printf("Ingrese la edad de %s ",nombre.toUpperCase());
        edad=sc.nextInt();
      
        System.out.println("");
 //Datos de los padres 
 sc.nextLine();
        System.out.println("-----------DATOS DEL PADRE-----------");
     System.out.println("Ingrese el primer y segundo nombre del Padre");
    nombrePadre=sc.nextLine();
        System.out.printf("Ingrese los apellidos de %s",nombrePadre);
        apellidosPadre=sc.nextLine();
        System.out.printf("Ingrese la edad de %s ",nombrePadre.toUpperCase());
        edadPadre=sc.nextInt();
        System.out.println("Ingrese el correo del padre");
        correo=sc.nextLine();
        System.out.println("Numero de telefono");
        celular=sc.nextLine();
        System.out.println("Proporcione su direccion");
        direccion=sc.nextLine();
        
        System.out.println("---------------RESULTADOS---------------");
        System.out.println("");
        System.out.println("DATOS DEL ALUMNO");
        System.out.printf("Su nombre es: %s %s ",nombre.toUpperCase(),apellidos.toUpperCase());
        System.out.println("Actualmente posee una edad de: "+edad);
        System.out.println("\n DATOS DEL PADRE");
         System.out.printf("Su nombre es: %s %s ",nombrePadre.toUpperCase(),apellidosPadre.toUpperCase());
        System.out.println("Actualmente posee una edad de: "+edadPadre);
        System.out.println("Su direccion es:"+direccion);
        System.out.println(correo);
    }

    
}