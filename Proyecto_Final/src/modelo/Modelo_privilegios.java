package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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
            priv.setCod_opcion(rs.getInt("cod_opcion"));
            priv.setEstado_rol(String.valueOf(rs.getBoolean("estado_rol")));
            pr.add(priv);
        }
        return pr;
    }

    public int verificarPrivilegios(String rol) {
        int cod = 0;
        try {
            String sql = "Select * from rol where tipo_rol= '" + rol+"'";
            ResultSet rs = con.consulta(sql);
            while (rs.next()) {
                cod = rs.getInt("codigo_rol");
            }

            if (cod != 0) {
                int c = 0;
                String sql1 = "Select * from relacion_rol_opciones where cod_rol= " + cod;
                ResultSet rs1 = con.consulta(sql1);
                while (rs1.next()) {
                    c = rs1.getInt("cod_rol");
                }
                return c;
            }else{
                return 0;
            }

        } catch (SQLException ex) {
            Logger.getLogger(Modelo_privilegios.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

}
