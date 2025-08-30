
package ej5;

public class Castor {
    private int cola;
    private int velocidad;      // (hasta 8km/h. ingresar por teclado)

      public Castor(int cola, int velocidad) {
        this.cola = cola;
        this.velocidad = velocidad;
    }
    
    public void nadar(){
       System.out.println("La velocidad es: "+velocidad); 

    }    
    public void tocarGuitarra(){
    }
}
