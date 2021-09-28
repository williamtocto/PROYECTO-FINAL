package modelo;

import Modelo.Rol;
import javax.swing.JOptionPane;

public class Modelo_Rol extends Rol {

    ConexionPG pg = new ConexionPG();

    public Modelo_Rol(int codigo_rol, String tipo_rol) {
        super(codigo_rol, tipo_rol);
    }

    public Modelo_Rol() {
    }

    public void grabarRol() {

        String sql = "INSERT INTO rol (tipo_rol) values ('" + getTipo_rol() + "')";
        if (pg.accion(sql)) {
            JOptionPane.showMessageDialog(null, "ROL GUARDADO CORRECTAMENTE");
        } 

    }
    
    public void eliminarRol() {
        String sql="DELETE FROM ROL WHERE tipo_rol= '"+getTipo_rol()+"'";
        if (pg.accion(sql)) {
            JOptionPane.showMessageDialog(null, "ROL ELIMINADO CORRECTAMENTE");
        }
    }
    
    public void modificarRol() {
        String sql="UPDATE FROM rol set tipo_rol= '"+getTipo_rol()+"' WHERE codigo_rol= "+getCodigo_rol();
        if (pg.accion(sql)) {
            JOptionPane.showMessageDialog(null, "MODIFICADO ELIMINADO CORRECTAMENTE");
        }
    }

}
