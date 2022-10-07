package modelo;

public class Cliente {

    private String nombre;
    private String direccion;
    private String correo;
    private String rut;
    private int numero;

    public Cliente(String nombre, String direccion, String correo, String rut, int numero) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.correo = correo;
        this.rut = rut;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }




    @Override
    public String toString() {
        return super.toString();
    }
}
