package Implementacion.logica;

public abstract class Objeto {

    protected String ID;
    protected String Nombre;
    protected boolean Disponible;

    public Objeto(String ID, String Nombre, boolean Disponible){

        this.ID = ID;
        this.Nombre = Nombre;
        this.Disponible = Disponible;
    }
    public abstract void agregar();
}
