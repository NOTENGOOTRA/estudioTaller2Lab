package controlador;

import modelo.*;



public class controller {

    public Vehiculo añadirVehiculo(String nombre, Marca marca, Color color, int anno, int kmRecorridos, int precio) {
        Vehiculo vehiculo = new Vehiculo(nombre, marca, color, anno, kmRecorridos , precio);


        return añadirVehiculo(nombre, marca, color, anno, kmRecorridos , precio);
    }

}
