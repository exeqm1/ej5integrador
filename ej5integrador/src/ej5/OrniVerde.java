package ej5;

import java.util.Scanner;

public class OrniVerde extends Castor implements Pata {
    String nombre;

    public OrniVerde(int cola, int velocidad, String nombre) {
        super(cola, velocidad);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    @Override
    public void tocarOrgano() {
        System.out.println("Do, Re, Mi");
        System.out.println("Presione enter");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        System.out.println("Fa, Sol, La, Si");
    }

    public void tocarGuitorgan() {
        super.tocarGuitarra();
        tocarOrgano();
        System.out.println("Cuaac, cuaaac...!");
    }

    @Override
    public String toString() {
        return "OrniVerde " + nombre;
    }
    
    
}
