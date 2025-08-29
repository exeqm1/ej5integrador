package ej5;

public class OrniAzul extends Castor {

    private int propulsion;

    @Override
    public int nadar() {
        int nadarOrniAzul = super.nadar() + propulsion;
        return nadarOrniAzul;
    }

}
