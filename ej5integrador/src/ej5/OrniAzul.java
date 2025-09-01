package ej5;

public class OrniAzul extends Castor {
    private final int propulsion;
    String nombre;

    public OrniAzul(int propulsion, String nombre, int cola, int velocidad) {
        super(cola, velocidad);
        this.propulsion = propulsion;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    @Override
    public int nadar() {
        int nadarOrniAzul = super.nadar() + propulsion;
        return nadarOrniAzul;
        
    }
    
        @Override
    public String toString() {
        return "OrniAzul " + nombre;
    }

}
