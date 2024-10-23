package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Empleado em1 = new Empleado("Jose",27,235.20);

        Empleado em2 = new Empleado();

        System.out.println("Ingrese el nombre del empleado: ");
        em2.setNombre(input.nextLine());
        System.out.println("Ingrese la edad del empleado: ");
        em2.setEdad(input.nextInt());
        input.nextLine();
        System.out.println("Ingrese el salario del empleado: ");
        em2.setSalario(input.nextDouble());


        System.out.println("EMPLEADO 1 DATOS QUEMADOS:");
        System.out.println("El nombre es:" + em1.getNombre());
        System.out.println("La edad que tiene es:" + em1.getEdad());
        System.out.println("El salario que percive es de:" + em1.getSalario());

        System.out.println("******************************************");
        System.out.println("EMPLEADO 2 INGRESADO POR TECLADO");
        System.out.println("El nombre es:" + em2.getNombre());
        System.out.println("La edad que tiene es:" + em2.getEdad());
        System.out.println("El salario que percive es de:" + em2.getSalario());


    }

}