/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;
import Modelo.Simbolo;

/**
 *
 * @author Benlly
 */
public class ControladorSimbolos {

    public ControladorSimbolos() {
    }

    public Simbolo crearSimbolo(String simbolo){
        return new Simbolo(simbolo);
    }

}
