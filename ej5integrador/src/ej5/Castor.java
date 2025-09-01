package ej5;

import java.util.Random;

public class Castor {

    public int cola;
    public int velocidad;      // (hasta 8km/h. ingresar por teclado)

    public Castor(int cola, int velocidad) {
        this.cola = cola;
        this.velocidad = velocidad;
    }

    public int nadar() {
        return velocidad;
    }

    public void tocarGuitarra() {
        Random rand = new Random();
        int cuerdaRand;
        cuerdaRand = 1 + rand.nextInt(6);
        System.out.println("Toca cuerda: " + cuerdaRand);
    }
}
