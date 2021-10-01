package modelo;

public class Modelo_privilegios extends Privilegios {

    ConexionPG con = new ConexionPG();

    public Modelo_privilegios(int cod_relacion, int cod_rol, int cod_opcion, String estado_rol) {
        super(cod_relacion, cod_rol, cod_opcion, estado_rol);
    }

    
    public boolean grabarPrivilegios() {
        String sql = "INSERT INTO relacion_rol_opciones (cod_rol,cod_opcion,estado_rol) "
                + "VALUES (" + getCod_rol() + ", " + getCod_opcion() + ", '" + getEstado_rol() + "');";
        return con.accion(sql);
    }

    public boolean modificarPrivilegios() {
        String sql = "UPDATE relacion_rol_opciones SET  estado_rol= '" + getEstado_rol()
                + "' WHERE cod_rol=" + getCod_relacion() + "and cod_opcion= " + getCod_opcion() + ";";
        return con.accion(sql);
    }

    public boolean EliminarPrivilegios() {
        String sql = "delete from relacion_rol_opciones where cod_rol='" + getCod_rol() + "';";
        return con.accion(sql);
    }

}
