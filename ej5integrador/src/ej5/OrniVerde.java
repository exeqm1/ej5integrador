
package ej5;

public class OrniVerde extends Castor implements Pata{
    
    public void nadar(){
        
    }
    @Override
    public void tocarOrgano(){
        System.out.println("cuac cuaac…!");
    }
    public void tocarGuitorgan(){
        super.tocarGuitarra();
        tocarOrgano();
        
        
    }
}
