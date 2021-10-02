package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Modelo_privilegios extends Privilegios {

    ConexionPG con = new ConexionPG();

    public Modelo_privilegios() {
    }

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
                + "' WHERE cod_rol=" + getCod_rol() + "and cod_opcion= " + getCod_opcion() + ";";
        return con.accion(sql);
    }

    public boolean EliminarPrivilegios() {
        String sql = "delete from relacion_rol_opciones where cod_rol=" + getCod_rol() + ";";
        return con.accion(sql);
    }

    public List<Privilegios> CargarLista() throws SQLException {
        String sql = "select * from relacion_rol_opciones where cod_rol= " + getCod_rol();
        ResultSet rs = con.consulta(sql);
        List<Privilegios> pr = new ArrayList<>();
        while (rs.next()) {
            Privilegios priv = new Privilegios();
            priv.setCod_opcion(rs.getInt("cod_rol"));
            priv.setEstado_rol(rs.getString("estado_rol"));
            pr.add(priv);
        }
        return pr;
    }

}
