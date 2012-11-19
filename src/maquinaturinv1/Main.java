/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package maquinaturinv1;

/**
 *
 * @author Benlly
 */

import vista.MaquinaTuring;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Simbolo prueba;
        for(int i = 0 ;i<=5;i++){
        prueba = new Simbolo();
        System.out.print(prueba.getSerial());
        }*/

        MaquinaTuring maquina = new MaquinaTuring();
        maquina.setVisible(true);
        maquina.setLocationRelativeTo(null);
        // TODO code application logic here
    }

}
