package com.aarmas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println ("Empezamos el programa");
        System.out.println ("¿Cúal es tu nombre?");
        String nombre = scan.next();
        System.out.println ("¿Cúal es tu nombre?");
        String apellido = scan.next();
        System.out.println ("¿Qué edad tienes?");
        int edad = scan.nextInt();
        System.out.println ("¿Tienes algún hobby?");
        String hobbby = scan.next();
        System.out.println ("¿Cúal es tu editor de código preferido?");
        String ide = scan.next();
        System.out.println ("¿Cúal es tu sistema operativo preferido?");
        String sistemaOperativo = scan.next();

        System.out.println("Los datos ingresados son:");
        System.out.println("Tu nombre es: " + nombre);
        System.out.println("Tu apellido es: " + apellido);
        System.out.println("Tu edad es: " + edad);
        System.out.println("Tu hobby es: " + hobbby);
        System.out.println("Tu editor de código preferido es: " + ide);
        System.out.println("Tu sistema operativo preferido es: " + sistemaOperativo);
    }
}
