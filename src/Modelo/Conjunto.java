package Modelo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 * @created 20-Sep-2010 5:32:51 p.m.
 */
public abstract class Conjunto {

	private int cant_simbolos = 0;
	private static int totalSimbolos = 0;
	public Simbolo m_Simbolo;
        private ArrayList<Simbolo> conjunto = new ArrayList<Simbolo>();

	public Conjunto(){
            
	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param simbolo
	 */
	public boolean agregarSimbolo(Simbolo simbolo){
                if(estaPresente(simbolo))
                    return false;
                else{
                    conjunto.add(simbolo);
                    cant_simbolos = conjunto.size();
                    Conjunto.totalSimbolos++;
                    return true;
                }
	}

	/**
	 * 
	 * @param simbolo
	 */
	public boolean compareSimbolo(Simbolo simbolo){
		return false;
	}

	/**
	 * 
	 * @param simbolo
	 */
	public boolean estaPresente(Simbolo simbolo){
            Iterator i = conjunto.iterator();
            while(i.hasNext()){
                Simbolo actual = (Simbolo)i.next();
                if(actual.getsimbolo().equals(simbolo.getsimbolo()))
                    return true;
            }
            return false;
	}

	public int getcant_simbolos(){
		return cant_simbolos;
	}

	/**
	 * 
	 * @param simbolo
	 */
	public int getNum(String sim){
            Simbolo simbolo;
            Iterator i = conjunto.iterator();
            while(i.hasNext()){
                simbolo = (Simbolo) i.next();
                if(simbolo.getsimbolo().equals(sim))
                    return simbolo.getnumero();
            }
            return -1;
	}

	/**
	 * 
	 * @param num
	 */
	public Simbolo getSimbolo(int num){
            Simbolo simbolo;
            Iterator i = conjunto.iterator();
            while(i.hasNext()){
                simbolo = (Simbolo) i.next();
                if(simbolo.getnumero()== num)
                    return simbolo;
            }
		return null;
	}

        public Simbolo getSimbolo(String sim){
            Simbolo simbolo;
            Iterator i = conjunto.iterator();
            while(i.hasNext()){
                simbolo = (Simbolo) i.next();
                if(simbolo.getsimbolo().equals(sim))
                    return simbolo;
            }
		return null;
        }

	public static int gettotalSimbolos(){
		return totalSimbolos;
	}

	/**
	 * 
	 * @param newVal
	 */
	public static void settotalSimbolos(int newVal){
		totalSimbolos = newVal;
	}

        public ArrayList<Simbolo> getTodo(){
            return conjunto;
        }

        public boolean borrarSimbolo( Simbolo aBorra){
            return conjunto.remove(aBorra);
        }

}