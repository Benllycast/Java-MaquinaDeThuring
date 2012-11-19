package Modelo;

import java.util.ArrayList;

/**
 * 
 * @created 20-Sep-2010 5:32:53 p.m.
 */
public class EstadosFinales extends ConjuntoEstados{

	public EstadosFinales(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param estado
	 */
	public int  agregarEstadoFinal(Estado estado){
            return super.agregarEstado(estado);
	}

	/**
	 * 
	 * @param estado
	 */
	public boolean comprobarSiFinal(Estado estado){
		return super.estaPresente(estado);
	}

}