package Modelo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 * @created 20-Sep-2010 5:32:51 p.m.
 */
public class ConjuntoEstados {

	public Estado m_Estado;
        public static int num_estados=0;
        ArrayList<Estado> listEstados;

	public ConjuntoEstados(){
            listEstados = new ArrayList<Estado>();
	}

	public void finalize() throws Throwable {

	}

    public ArrayList<Estado> getListEstados() {
        return listEstados;
    }

    public void setListEstados(ArrayList<Estado> listEstados) {
        this.listEstados = listEstados;
    }

    public  int getNum_estados() {
        return listEstados.size();
    }

    public static void setNum_estados(int num_estados) {
        ConjuntoEstados.num_estados = num_estados;
    }

	/**
	 * 
	 * @param estado
	 */
	public int agregarEstado(Estado estado){
            if(estaPresente(estado))
		return 0;
            else{
                listEstados.add(estado);
                return 1;
            }
	}

        public boolean  estaPresente(Estado estado){
            Estado actual;
            Iterator i = listEstados.iterator();
            while(i.hasNext()){
                actual = (Estado)i.next();
                if(actual.esIgual(estado))
                    return  true;
            }

            return false;
        }

    public Estado getEstado(int numero_estado) {
        Iterator i = listEstados.iterator();
        while(i.hasNext()){
            Estado actual = (Estado)i.next();
            if(actual.getNum_Estado()== numero_estado)
                return actual;
        }
        return null;
    }

    public Estado getEstado(String estadoDestino) {
        Iterator i = listEstados.iterator();
        while(i.hasNext()){
            Estado actual = (Estado)i.next();
            if(actual.getnombre().equals(estadoDestino))
                return actual;
        }
        return null;
    }

    public boolean borrarEstado(Estado estado) {
        return listEstados.remove(estado);
    }

}