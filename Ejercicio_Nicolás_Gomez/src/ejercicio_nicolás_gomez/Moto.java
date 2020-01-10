
package ejercicio_nicolás_gomez;

import java.util.ArrayList;

public class Moto extends Vehiculo{
    private String cilindradas;

    public Moto(String marca, String modelo, double precio, String cilindradas) {
        super(marca, modelo, precio);
        this.cilindradas = cilindradas;
    }
    
    @Override
    public Auto vehiculoMasCaro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Auto vehiculoMasBarato() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Auto vehiculoConY() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(String cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public String toString() {
        return super.toString() + "// Cilindradas: " + this.cilindradas + " // Precio: $" + String.format("%.2f", this.precio);
    }

    @Override
    public ArrayList<Auto> ordenarVehiculos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
