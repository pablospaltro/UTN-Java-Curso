package entidades;

public abstract class Tarea {
    protected String nombre;
    protected boolean completado;

    public Tarea() {
    }

    public Tarea(String nombre, boolean completado) {
        this.nombre = nombre;
        this.completado = completado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isCompletado() {
        return completado;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }

    @Override
    public String toString() {
        return "Tarea [nombre=" + nombre + ", completado=" + completado + "]";
    }

}