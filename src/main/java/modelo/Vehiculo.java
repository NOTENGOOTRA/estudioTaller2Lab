package modelo;

public class Vehiculo {
    private String nombre;
    private Marca marca;
    private Color color;
    private int anno;
    private int kmRecorridos;
    private int precio;

    public Vehiculo(String nombre, Marca marca, Color color, int anno, int kmRecorridos, int precio) {
        this.nombre = nombre;
        this.marca = marca;
        this.color = color;
        this.anno = anno;
        this.kmRecorridos = kmRecorridos;
        this.precio = precio;
    }
    public Vehiculo() {

    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public int getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(int kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

}
