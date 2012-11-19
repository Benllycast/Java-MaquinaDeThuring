package Modelo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Benlly
 * @version 1.0
 * @created 20-Sep-2010 5:32:59 p.m.
 */
public class AdminSimbolos {

	public Alfabeto m_Alfabeto;
	private SimbolosEspeciales m_SimbolosEspeciales;

	public AdminSimbolos(){
            m_Alfabeto = new Alfabeto();
            m_SimbolosEspeciales = new SimbolosEspeciales();
	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param simbolo
	 */
	public int agregarSimboloEnAlfabeto(Simbolo simbolo){
            if(m_SimbolosEspeciales.estaPresente(simbolo))
                return 0;
            return (m_Alfabeto.agregarSimbolo(simbolo))? 1:0;
	}

	/**
	 * 
	 * @param simbolo
	 */
	public int agregarSimboloEnEspeciales(Simbolo simbolo){
            if(m_Alfabeto.estaPresente(simbolo))
                return 0;
            return (m_SimbolosEspeciales.agregarSimbolo(simbolo))? 1:0;
	}

	/**
	 * 
	 * @param n_simbolo
	 */
	public Simbolo getSimboloAlfabeto(int n_simbolo){
                Simbolo simbolo = m_Alfabeto.getSimbolo(n_simbolo);
		return simbolo;
	}

	/**
	 * 
	 * @param n_simbolo
	 */
	public Simbolo getSimboloEspecial(int n_simbolo){
            Simbolo simbolo = m_SimbolosEspeciales.getSimbolo(n_simbolo);
		return simbolo;
	}

        public ArrayList<Simbolo> getTodoAlfabeto() {
            return m_Alfabeto.getTodo();
        }

        public ArrayList<Simbolo> getTodoEspeciales() {
            return m_SimbolosEspeciales.getTodo();
        }

    public Simbolo getSimbolo(String simboloEscritura) {
        Simbolo sim = m_Alfabeto.getSimbolo(simboloEscritura);
        if(sim != null)return sim;
        sim = m_SimbolosEspeciales.getSimbolo(simboloEscritura);
        if(sim != null)return sim;
        return null;

    }

    public boolean borrarDeAlfabeto(Simbolo aBorrar) {
        return m_Alfabeto.borrarSimbolo(aBorrar);
    }

    public boolean borrarDeEspeciales(Simbolo aBorrar) {
        return m_SimbolosEspeciales.borrarSimbolo(aBorrar);
    }

}