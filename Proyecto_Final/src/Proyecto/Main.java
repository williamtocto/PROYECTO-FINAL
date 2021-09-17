/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import Vista.Login;
import controlador.control_usuario;
import modelo.Modelo_Usuario;

/**
 *
 * @author PCX
 */
public class Main {

    public static void main(String[] args) {
        Modelo_Usuario modelo = new Modelo_Usuario();
        Login vista = new Login();
        control_usuario control = new control_usuario(modelo, vista);
        control.iniciaControl();
    }
    
}
