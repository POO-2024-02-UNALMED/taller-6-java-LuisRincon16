package vehiculos;

public class Camioneta extends Vehiculo{
    private boolean volco;

    public Camioneta(String placa, int puertas, String nom, int precio, int peso, Fabricante fabri, boolean volco){
        super(placa, puertas, 90, nom, precio, peso, "4X4", fabri);
        this.volco = volco;
    }

    public void setVolco(boolean volco){
        this.volco = volco;
    }
    public boolean isVolco(){
        return this.volco;
    }


    
}