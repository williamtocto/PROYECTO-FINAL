
package modelo;

public class Modelo_Multa extends Multa {

    public Modelo_Multa(int codigo_multa, int codigo_asistencia, String estado_multa) {
        super(codigo_multa, codigo_asistencia, estado_multa);
    }

    public Modelo_Multa() {
    }
    
    
    public boolean AsignarMulta() {
        ConexionPG con=new ConexionPG();     
        String sql="Insert into multa(codigo_asistencia,estado_multa) values ('"+getCodigo_asistencia()+"','"+getEstado_multa()+"';";
        return con.accion(sql);
    }
    
    
}
