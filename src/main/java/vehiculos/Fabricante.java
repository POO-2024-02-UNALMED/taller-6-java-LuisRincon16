package vehiculos;
import java.util.ArrayList;

public class Fabricante {
    private String nombre;
    private Pais pais;
    private static ArrayList<Fabricante> listadoF = new ArrayList<>();
    private int contadorF;

    public Fabricante(String nom, Pais pais){
        this.nombre = nom;
        this.pais = pais;
        Fabricante.listadoF.add(this);
    }

    public static void setListadoF(ArrayList<Fabricante> list){
        Fabricante.listadoF = list;
    }
    public static ArrayList<Fabricante> getListadoF(){
        return Fabricante.listadoF;
    }

    public int getContadorF(){
        return this.contadorF;
    }
    public void setContadorF(){
        this.contadorF += 1;
    }

    public void setNombre(String nom){
        this.nombre = nom;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setPais(Pais pais){
        this.pais = pais;
    }
    public Pais getPais(){
        return this.pais;
    }
    
    public static Fabrica fabricaMayorVentas(){
        int maxVentas = 0;
        Fabricante fMasVendedora = null;
        
        for(Fabricante i : listadoF){
            if (i.getContadorF() >= maxVentas){
                maxVentas = i.getContadorF();
                fMasVendedora = i;
            }
        }
        return fMasVendedora;
    }
}