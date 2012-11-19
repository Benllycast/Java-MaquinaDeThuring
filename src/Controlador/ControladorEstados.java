/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.Estado;

/**
 *
 * @author Benlly
 */
public class ControladorEstados {

    public ControladorEstados() {
    }

    public Estado crearEstado(String nombre){
        return new Estado(nombre);
    }
}
