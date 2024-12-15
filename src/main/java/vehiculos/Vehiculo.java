package vehiculos;

public class Vehiculo {
    public String placa;
    public int puertas;
    public int velocidadMaxima;
    public String nombre;
    public int precio;
    public int peso;
    public String traccion;
    public Fabricante fabricante;
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
}
