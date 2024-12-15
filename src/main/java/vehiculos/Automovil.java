package vehiculos;
import java.util.ArrayList;

public class Automovil extends Vehiculo{
    private int puestos;
    public static ArrayList<Automovil> listado = new ArrayList<>();

    public Automovil(String placa, String nom, int precio, int peso, Fabricante fabri, int puestos){
        super(placa, 4, 100, nom, precio, peso, "FWD", fabri);
        this.puestos = puestos;   
    }
    
    {
        Automovil.listado.add(this);
    }

    public void setPuestos(int puestos){
        this.puestos = puestos;
    }
    public int getPuestos(){
        return this.puestos;
    }
}