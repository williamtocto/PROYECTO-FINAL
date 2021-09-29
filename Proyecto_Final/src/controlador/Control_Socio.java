/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Modelo_Socio;
import vista.Vista_Socio;

/**
 *
 * @author TUF Gaming
 */
public class Control_Socio {
    private Modelo_Socio modelo;
    private Vista_Socio vista;


    public Control_Socio(Modelo_Socio modelo, Vista_Socio vista) {
        this.modelo = modelo;
        this.vista = vista;
         vista.setTitle("Datos y registro del Socio");
        vista.setVisible(true);
    }
    
    public Control_Socio(){
        
    }
    
    public void IniciarContro(){
        
    }
    
    
    
}
