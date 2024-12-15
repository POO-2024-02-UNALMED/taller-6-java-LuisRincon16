package vehiculos;

public class Vehiculo {
    private String placa;
    private int puertas;
    private int velocidadMaxima;
    private String nombre;
    private int precio;
    private int peso;
    private String traccion;
    private Fabricante fabricante;
    public static int CantidadVehiculos;
    
    public Vehiculo(String placa, int puertas, int VM, String nom, int precio, int peso, String traccion, Fabricante fabri){
        this.placa = placa;
        this.puertas = puertas;
        this.velocidadMaxima = VM;
        this.nombre = nom;
        this.precio = precio;
        this.peso = peso;
        this.traccion = traccion;
        this.fabricante = fabri;

        CantidadVehiculos++;
    }

    public Vehiculo(){
        
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }
    public String getPlaca(){
        return this.placa;
    }

    public void setPuertas(int puertas){
        this.puertas = puertas;
    }
    public int getPuertas(){
        return this.puertas;
    }

    public void setVelocidadMaxima(int VM){
        this.velocidadMaxima = VM;
    }
    public int getVelocidadMaxima(){
        return this.velocidadMaxima;
    }

    public void setNombre(String nom){
        this.nombre = nom;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setPrecio(int precio){
        this.precio = precio;
    }
    public int getPrecio(){
        return this.precio;
    }

    public void setPeso(int peso){
        this.peso = peso;
    }
    public int getPeso(){
        return this.peso;
    }

    public void setTraccion(String traccion){
        this.traccion = traccion;
    }
    public String getTraccion(){
        return this.traccion;
    }

    public void setFabricante(Fabricante fabri){
        this.fabricante = fabri;
    }
    public Fabricante getFabricante(){
        return this.fabricante;
    }

    public static void setCantidadVehiculos(int CV){
        Vehiculo.CantidadVehiculos = CV;
    }
    public static int getCantidadVehiculos(){
        return Vehiculo.CantidadVehiculos;
    }

}
