package vehiculos;

public class Camioneta extends Vehiculo{
    public boolean volco;

    public Camioneta(String placa, int puertas, String nom, int precio, int peso, Fabricante fabri, boolean volco){
        super(placa, puertas, 90, nom, precio, peso, "4X4", fabri);
        this.volco = volco;
    }


    
}