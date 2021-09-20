/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import conexion.Conexion_sql;

/**
 *
 * @author PCX
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexion_sql c = new Conexion_sql();
        c.conexi();

    }

}
