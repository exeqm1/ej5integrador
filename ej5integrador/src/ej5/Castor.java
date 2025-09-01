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
        int cuerdaRand1;
        int cuerdaRand2;
        int cuerdaRand3;
        cuerdaRand1= 1 + rand.nextInt(6);
        cuerdaRand2= 1 + rand.nextInt(6);
        cuerdaRand3= 1 + rand.nextInt(6);
        System.out.println("Toca cuerda: " + cuerdaRand1);
        System.out.println("Toca cuerda: " + cuerdaRand2);
        System.out.println("Toca cuerda: " + cuerdaRand3);
        
        //ahora toca 3 cuerdas random
        
    }
}
