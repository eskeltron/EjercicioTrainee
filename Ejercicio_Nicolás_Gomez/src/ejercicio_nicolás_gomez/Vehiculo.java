
package ejercicio_nicolás_gomez;

import java.util.ArrayList;

abstract public class Vehiculo implements CaracteristicasAutos{
    protected String marca;
    protected String modelo;
    protected double precio;

    public Vehiculo(String marca, String modelo, double precio){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    public static Vehiculo vehiculoMasCaro(ArrayList<Vehiculo> vehiculos){
        Vehiculo vehiculoCaro = vehiculos.get(0);
        for(Vehiculo act : vehiculos){
            if(act.precio > vehiculoCaro.precio){
                vehiculoCaro = act;
            }
        }
        return vehiculoCaro;
    }
    public static Vehiculo vehiculoMasBarato(ArrayList<Vehiculo> vehiculos){
        Vehiculo autoBarato = vehiculos.get(0);
        for(Vehiculo act : vehiculos){
            if(act.precio < autoBarato.precio){
                autoBarato = act;
            }
        }
        return autoBarato;
    }
    public static Vehiculo vehiculoConY(ArrayList<Vehiculo> vehiculos){
        Vehiculo vehiculoConLetraY = null;
        for(Vehiculo act : vehiculos){
            for(int i = 0 ; i < act.modelo.length() ; i++){
                if(act.marca.charAt(i) == 'y' || act.marca.charAt(i) =='Y'){
                    vehiculoConLetraY = act;
                }
            }
        }
        return vehiculoConLetraY;  
    }
    
    public static ArrayList<Vehiculo> ordenarVehiculos(ArrayList<Vehiculo> vehiculos){
        Vehiculo vehiculoAux = null;
        for(int i = 0 ; i < vehiculos.size() ; i++){
            for(int j = 0 ; j < vehiculos.size()-1 ; j++){
                if(vehiculos.get(j).precio < vehiculos.get(j+1).precio){
                    vehiculoAux = vehiculos.get(j);
                    vehiculos.set(j, vehiculos.get(j+1));
                    vehiculos.set(j+1, vehiculoAux);
                }
            }

        }
        return vehiculos;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Marca: " + this.marca + " // Modelo: " + this.modelo + " ";
    }
    
    
    
}
