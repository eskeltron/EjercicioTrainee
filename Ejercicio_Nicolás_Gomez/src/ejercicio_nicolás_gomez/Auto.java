
package ejercicio_nicolás_gomez;

import java.util.ArrayList;


public class Auto extends Vehiculo{
    private int cantPuertas;
    
    public Auto(String marca, String modelo, double precio, int cantPuertas) {
        super(marca, modelo, precio);
        this.cantPuertas = cantPuertas;
    }

    public Auto vehiculoMasCaro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Auto vehiculoMasBarato() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Auto vehiculoConY() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }

    @Override
    public String toString() {
        return super.toString() + "// Puertas: " + this.cantPuertas + " // Precio: $" + String.format("%.2f", this.precio);
    }

    @Override
    public ArrayList<Auto> ordenarVehiculos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
