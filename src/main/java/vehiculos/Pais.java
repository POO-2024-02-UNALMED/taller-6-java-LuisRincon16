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