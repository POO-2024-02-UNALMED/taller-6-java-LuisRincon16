package vehiculos;

public class Camion extends Vehiculo{
    private int ejes;

    public Camion(String placa, String nom, int precio, int peso, Fabricante fabri, int ejes){
        super(placa, 2, 80, nom, precio, peso, "4X2", fabri);
        this.ejes = ejes;
    }

    public void setEjes(int ejes){
        this.ejes = ejes;
    }
    public int getEjes(){
        return this.ejes;
    }

}