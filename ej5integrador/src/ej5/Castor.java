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

        for (int i = 0; i < 3; i++) {
            int num = (int) (Math.random() * 6 + 1);
            System.out.println("Toca cuerda " + num);
        }
    } //nuevo metodo tocar guitarra
}
