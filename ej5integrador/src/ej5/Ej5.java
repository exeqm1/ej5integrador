package ej5;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Ej5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la longitud (en cm) de la cola del castor: ");
        int cola = sc.nextInt();
        boolean correcto = false;

        int velocidad;
        do {
            System.out.println("Ingrese la velocidad del castor (hasta 8 km/h): ");
            velocidad = sc.nextInt();
            sc.nextLine();
            if (velocidad > 1 && velocidad < 9) {
                correcto = true;
            } else {
                System.out.println("Velocidad fuera de rango.");
            }
        } while (correcto == false);

        Castor papaCastor = new Castor(cola, velocidad);

        System.out.println("Ingrese el nombre del Orni Verde: ");
        String nombre = sc.nextLine();
        OrniVerde verde1 = new OrniVerde(cola, velocidad, nombre);

        correcto = false;
        int propulsion;
        do {
            System.out.println("Ingrese la propulsion (de 5 a 10 km/h) de OrniAzul (blue)");
            propulsion = sc.nextInt();
            if (propulsion > 4 && propulsion < 11) {
                correcto = true;
            } else {
                System.out.println("Velocidad fuera de rango.");
            }
        } while (correcto == false);

        OrniAzul azul1 = new OrniAzul(propulsion, "blue", cola, velocidad);


        correcto = false;
        do {
            System.out.println("Ingrese la propulsion (de 5 a 10 km/h) de OrniAzul (blue)");
            propulsion = sc.nextInt();
            if (propulsion > 4 && propulsion < 11) {
                correcto = true;
            } else {
                System.out.println("Velocidad fuera de rango.");
            }
        } while (correcto == false);
        
        
        OrniAzul azul2 = new OrniAzul(propulsion, "blui", cola, velocidad);

        System.out.println("");
        System.out.println("====================================================");

        System.out.println("HABILIDADES DE ORNI VERDE, nombre: " + verde1.getNombre());

        System.out.println("Guitarra: ");
        verde1.tocarGuitarra();

        System.out.println("Organo: ");
        verde1.tocarOrgano();

        System.out.println("Guitorgan");
        verde1.tocarGuitorgan();

        System.out.println("");
        System.out.println("===================================================");

        System.out.println("HABILIDADES DE ORNI AZUL, nombre: " + azul1.getNombre());

        System.out.println("Habilidades de nado: ");
        System.out.println(azul1.nadar() + " km/h");
        System.out.println("Guitarra: ");
        azul1.tocarGuitarra();

        System.out.println("");
        System.out.println("===================================================");

        System.out.println("HABILIDADES DE ORNI AZUL, nombre: " + azul2.getNombre());

        System.out.println("Habilidades de nado: ");
        System.out.println(azul2.nadar() + " km/h");
        System.out.println("Guitarra: ");
        azul2.tocarGuitarra();

        System.out.println("");
        System.out.println("===================================================");

        Castor[] listaOrnis = new Castor[3];

        listaOrnis[0] = verde1;
        listaOrnis[1] = azul2;
        listaOrnis[2] = azul1;

        try {

            for (int i = 0; i < listaOrnis.length + 1; i++) {
                System.out.println(listaOrnis[i]);

            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indice fuera de rango.");

        } finally {
            System.out.println("Los ornitohermanos juntos al fin");

        }

    }
}
