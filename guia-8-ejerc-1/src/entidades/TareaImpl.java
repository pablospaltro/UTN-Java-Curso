package entidades;

public class TareaImpl extends Tarea {

    public TareaImpl() {
    }

    public TareaImpl(String nombre, boolean completado) {
        super(nombre, completado);
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public boolean isCompletado() {
        return super.isCompletado();
    }

    @Override
    public void setCompletado(boolean completado) {
        super.setCompletado(completado);
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}