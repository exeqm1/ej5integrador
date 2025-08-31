
package ej5;

public class Castor {
    private int cola;
    private int velocidad;      // (hasta 8km/h. ingresar por teclado)

    public Castor(int cola, int velocidad) {
        this.cola = cola;
        this.velocidad = velocidad;
    }
      
    
    
    
    public int nadar(){
        return velocidad;

    }    
   
    public void tocarGuitarra(){
          int num=(int)(Math.random()*6+1);
          System.out.println("Toca cuerda "+num);
    }
    
}
