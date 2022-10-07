package modelo;

import java.util.ArrayList;
import java.util.List;
import Recursos.*;



public class Automotora {

    private List<Vehiculo> vehiculosRegistrados;
    private List<Cliente> clientesRegistrados;


    //OJO CON ESTO PUEDE ESTAR MALO
    public Automotora(List<Vehiculo> vehiculosRegistrados, List<Cliente> clientesRegistrados) {
        this.vehiculosRegistrados = vehiculosRegistrados;
        this.clientesRegistrados = clientesRegistrados;
    }

    public List<Vehiculo> getVehiculosRegistrados() {
        return vehiculosRegistrados;
    }

    public List<Cliente> getClientesRegistrados() {
        return clientesRegistrados;
    }

    public Cliente buscarCliente(String rut) {
        Cliente cliente = null;
        for (Cliente clienteAux : this.clientesRegistrados) {
            if (clienteAux.getRut().equals(rut)) {
                cliente = clienteAux;
                break;

            }
        }
        return cliente;
    }

    public boolean añadirCliente(String nombre, String direccion, String correo, String rut, int numero) {
                if (ValidadorRut.validarDigito(rut) && this.buscarCliente(rut) == null) {
                    Cliente cliente = new Cliente(nombre, direccion, correo, rut, numero);
                    this.clientesRegistrados.add(cliente);
                    return true;
                } else {
                    return false;
                }
            }



    public Vehiculo añadirVehiculo(String nombre, Marca marca, Color color, int anno, int kmRecorridos, int precio){
        Vehiculo vehiculo= new Vehiculo( nombre, marca, color,anno,kmRecorridos,precio);
        this.vehiculosRegistrados.add(vehiculo);

        return vehiculo;
    }

    public List<Vehiculo> buscarAutoNombreForBasico(String nombre) {
        List<Vehiculo> vehiculos = new ArrayList<>();
        for (int i = 0; i < this.vehiculosRegistrados.size(); i++) {
            if (this.vehiculosRegistrados.get(i).getNombre().equals(nombre)) {
                vehiculos.add(this.vehiculosRegistrados.get(i));
            }
        }
        return vehiculos;
    }

    public List<Vehiculo> buscarAutoNombre(String nombre) {
        List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
        for (Vehiculo auto : this.vehiculosRegistrados) {
            if (auto.getNombre().equals(nombre)) {
                vehiculos.add(auto);
            }
        }
        return vehiculos;
    }
    public List<Vehiculo> buscarAutoMarca(Marca marca) {
        List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
        for (Vehiculo auto : this.vehiculosRegistrados) {
            if (auto.getMarca().equals(marca)) {
                vehiculos.add(auto);
            }
        }
        return vehiculos;
    }

    public void mostrarAutosLista(List<Vehiculo> vehiculos) {
        for (Vehiculo auto : vehiculos) {
            String datos = "nombre: " + auto.getNombre() + ", marca: " + auto.getMarca() + ", año: " + auto.getAnno()
                    + ", color= " + auto.getColor() + ", precio: " + auto.getPrecio() + ", kmRecorridos: " + auto.getKmRecorridos();
            System.out.println(datos);
        }
    }

}