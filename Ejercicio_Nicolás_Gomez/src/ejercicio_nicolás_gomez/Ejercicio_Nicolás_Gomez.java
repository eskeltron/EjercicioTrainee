
package ejercicio_nicolás_gomez;

import java.util.ArrayList;

public class Ejercicio_Nicolás_Gomez {

    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
        vehiculos.add(new Auto("Peugeot", "206",20000.00, 4));
        vehiculos.add(new Moto("Honda", "Titan",60000.00, "125c"));
        vehiculos.add(new Auto("Peugeot", "208",250000.00, 5));
        vehiculos.add(new Moto("Yamaha", "YBR",80500.50, "165c"));
        for(Vehiculo act : vehiculos){
            System.out.println(act.toString());
        }
        System.out.println("=============================");
        System.out.println("Vehículo más caro: " + Vehiculo.vehiculoMasCaro(vehiculos));
        System.out.println("Vehículo más barato: " + Vehiculo.vehiculoMasBarato(vehiculos));
        Vehiculo vehiculoConLetraY = Vehiculo.vehiculoConY(vehiculos);
        if( vehiculoConLetraY != null){
            System.out.println("Vehículo que contiene en el modelo la letra 'Y': " + vehiculoConLetraY.getMarca() + " " + vehiculoConLetraY.getModelo() + " " + String.format("%.2f", vehiculoConLetraY.getPrecio()) );
        }else{
            System.out.println("No hay un vehículo que contenga en el modelo la letra 'Y'.");
        }
        System.out.println("=============================");
        System.out.println("Vehículos ordenados por precio de mayor a menor:");
        vehiculos = Vehiculo.ordenarVehiculos(vehiculos);
        for(Vehiculo act : vehiculos){
            System.out.println(act.toString());
        }
    }
}
