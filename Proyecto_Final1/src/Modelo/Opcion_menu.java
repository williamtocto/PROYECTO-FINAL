package Modelo;

public class Opcion_menu {

    private int opcion_menu;
    private String nombre_menu;
    private boolean  estado;

    public Opcion_menu(int opcion_menu, String nombre_menu, boolean estado) {
        this.opcion_menu = opcion_menu;
        this.nombre_menu = nombre_menu;
        this.estado = estado;
    }

    public int getOpcion_menu() {
        return opcion_menu;
    }

    public void setOpcion_menu(int opcion_menu) {
        this.opcion_menu = opcion_menu;
    }

    public String getNombre_menu() {
        return nombre_menu;
    }

    public void setNombre_menu(String nombre_menu) {
        this.nombre_menu = nombre_menu;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    
}
