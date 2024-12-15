package vehiculos;
import java.util.ArrayList;

public class Camioneta extends Vehiculo{
    private boolean volco;
    private static ArrayList<Camioneta> listado = new ArrayList<>();

    public Camioneta(String placa, int puertas, String nom, int precio, int peso, Fabricante fabri, boolean volco){
        super(placa, puertas, 90, nom, precio, peso, "4X4", fabri);
        this.volco = volco;

        Camioneta.listado.add(this);
    }

    public void setVolco(boolean volco){
        this.volco = volco;
    }
    public boolean isVolco(){
        return this.volco;
    }

    public static void setListado(ArrayList<Camioneta> list){
        Camioneta.listado = list;
    }
    public static ArrayList<Camioneta> getListado(){
        return Camioneta.listado;
    }


    
}