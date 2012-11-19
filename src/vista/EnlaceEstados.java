/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * EnlaceEstados.java
 *
 * Created on 21/09/2010, 03:05:10 PM
 */

package vista;

import Modelo.Enlace;
import java.util.Iterator;

/**
 *
 * @author Benlly
 */
public class EnlaceEstados extends javax.swing.JDialog {

    vista.ConjuntoEstados parent;
    private Enlace enlaceNuevo = null;
    String simboloEntrada = null;

    public Enlace getEnlaceNuevo() {
        return enlaceNuevo;
    }

    public void setEnlaceNuevo(Enlace enlaceNuevo) {
        this.enlaceNuevo = enlaceNuevo;
    }

    /** Creates new form EnlaceEstados */
    public EnlaceEstados(vista.ConjuntoEstados parent, boolean modal) {
        super(parent, modal);
        initComponents();        
        this.parent = parent;
        load();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox_EstadoDestino = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox_SimboloEscritura = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jComboBox_Direccion = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBox_SimboloEntrada = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ENLACE A ESTADO");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel1.setText("Estado de Destino");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel2.setText("Simbolo de Escritura");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel3.setText("Direccion");

        jComboBox_Direccion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Derecha", "Izquierda", "No Mover" }));

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptar(evt);
            }
        });

        jButton2.setText("Cancelar");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel4.setText("Simbolo de Entrada");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addComponent(jComboBox_EstadoDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox_SimboloEscritura, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox_SimboloEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBox_SimboloEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addComponent(jComboBox_EstadoDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(3, 3, 3)
                .addComponent(jComboBox_SimboloEscritura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(3, 3, 3)
                .addComponent(jComboBox_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aceptar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptar
        
        simboloEntrada = (String)jComboBox_SimboloEntrada.getSelectedItem();
        String estadoDestino = (String)jComboBox_EstadoDestino.getSelectedItem();
        String simboloEscritura = (String)jComboBox_SimboloEscritura.getSelectedItem();

        Modelo.Estado estado = parent.parent.getConjuntoEstados().getEstado(estadoDestino);
        Modelo.Simbolo simbolo = parent.parent.getAdministrador().getSimbolo(simboloEscritura);

        int direccion = jComboBox_Direccion.getSelectedIndex();
        if(estado!= null && simbolo != null ){
            this.enlaceNuevo = new Enlace();
            enlaceNuevo.setstate(estado);
            enlaceNuevo.setsimbolo(simbolo);
            enlaceNuevo.setdireccion(direccion);
        }

        this.setVisible(false);
    }//GEN-LAST:event_aceptar

    public void load(){
        //simbolos del alfabeto
        
        Iterator i = parent.parent.getAdministrador().getTodoAlfabeto().iterator();
        while(i.hasNext()){
            Modelo.Simbolo actual = (Modelo.Simbolo)i.next();
            jComboBox_SimboloEntrada.addItem(actual.getsimbolo());
            jComboBox_SimboloEscritura.addItem(actual.getsimbolo());
        }

        //simbolos del especiales
        i = parent.parent.getAdministrador().getTodoEspeciales().iterator();
        while(i.hasNext()){
            Modelo.Simbolo actual = (Modelo.Simbolo)i.next();
            jComboBox_SimboloEntrada.addItem(actual.getsimbolo());
            jComboBox_SimboloEscritura.addItem(actual.getsimbolo());
        }

        i = parent.parent.getConjuntoEstados().getListEstados().iterator();
        while(i.hasNext()){
            Modelo.Estado actual = (Modelo.Estado)i.next();
            jComboBox_EstadoDestino.addItem(actual.getnombre());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox_Direccion;
    private javax.swing.JComboBox jComboBox_EstadoDestino;
    private javax.swing.JComboBox jComboBox_SimboloEntrada;
    private javax.swing.JComboBox jComboBox_SimboloEscritura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables

}
