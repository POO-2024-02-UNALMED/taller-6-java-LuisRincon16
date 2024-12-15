package vehiculos;

public class Fabricante {
    private String nombre;
    private Pais pais;

    public Fabricante(String nom, Pais pais){
        this.nombre = nom;
        this.pais = pais;
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
    
}