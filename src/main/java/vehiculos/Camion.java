package vehiculos;
import java.util.ArrayList;

public class Camion extends Vehiculo{
    private int ejes;
    private static ArrayList<Camion> listado = new ArrayList<>();

    public Camion(String placa, String nom, int precio, int peso, Fabricante fabri, int ejes){
        super(placa, 2, 80, nom, precio, peso, "4X2", fabri);
        this.ejes = ejes;

        Camion.listado.add(this);
    }

    public void setEjes(int ejes){
        this.ejes = ejes;
    }
    public int getEjes(){
        return this.ejes;
    }

    public static void setListado(ArrayList<Camion> list){
        Camion.listado = list;
    }
    public static ArrayList<Camion> getListado(){
        return Camion.listado;
    }

}