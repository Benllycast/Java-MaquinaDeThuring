package Modelo;

/**
 * @author Benlly
 * @version 1.0
 * @created 20-Sep-2010 5:32:59 p.m.
 */
public class Enlace {

        public static final int DERECHA = 0;
        public static final int IZQUIERDA = 1;
        public static final int NOMOVER = 2;
	private int direccion;
	private Simbolo simbolo;
	private Estado state;

	public Enlace(){
            this.direccion = Enlace.DERECHA;
	}

        public Enlace(int direccion, Simbolo simbolo, Estado state) {
            this.direccion = direccion;
            this.simbolo = simbolo;
            this.state = state;
        }

	public void finalize() throws Throwable {

	}

	public int getDireccion(){
		return 0;
	}

	public int getdireccion(){
		return direccion;
	}

	public Simbolo getsimbolo(){
		return simbolo;
	}

	public Estado getstate(){
		return state;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setdireccion(int newVal){
		direccion = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setsimbolo(Simbolo newVal){
		simbolo = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setstate(Estado newVal){
		state = newVal;
	}

}