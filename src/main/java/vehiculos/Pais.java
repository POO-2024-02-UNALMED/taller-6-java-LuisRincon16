package vehiculos;
import java.util.ArrayList;

public class Pais{
    private String nombre;
    private static ArrayList<Fabricante> Fabricantes = Fabricante.getListadoF();
    private int contadorP;

    public static ArrayList<Fabricante> getFabricantes(){
        return Pais.Fabricantes;
    }

    public int getContadorP(){
        return this.contadorP;
    }
    public void setContadorP(){
        this.contadorP += 1;
    }

    public static Pais paisMasVendedor(){
        int maxNumPaises = 0;
        Pais paisMasVen = null;
        
        for (Fabricante i : Fabricantes){
            if (i.getPais().getContadorP() >= maxNumPaises){
                maxNumPaises = i.getPais().getContadorP();
                paisMasVen = i.getPais();
            }
        }
        
        return paisMasVen;
    }


    public Pais(String nom){
        this.nombre = nom;
    }

    public void setNombre(String nom){
        this.nombre = nom;
    }
    public String getNombre(){
        return this.nombre;
    }




}