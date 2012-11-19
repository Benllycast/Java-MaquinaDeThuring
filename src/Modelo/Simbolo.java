package Modelo;

/**
 * 
 * @created 20-Sep-2010 5:32:54 p.m.
 */
public class Simbolo {

	public int numero;
	public String simbolo;
        private static int serial = 0;

	public Simbolo(){
            Simbolo.serial++;
	}

    public Simbolo(String simbolo) {

        this.simbolo = simbolo;
        this.numero = Conjunto.gettotalSimbolos();
    }

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param simbolo
	 */
	public int getNumero(String simbolo){
		return 0;
	}

	public int getnumero(){
		return numero;
	}

	public String getsimbolo(){
		return simbolo;
	}

        public static int getSerial(){
            return Simbolo.serial;
        }

	/**
	 * 
	 * @param newVal
	 */
	public void setnumero(int newVal){
		numero = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setsimbolo(String newVal){
		simbolo = newVal;
	}

	/**
	 * 
	 * @param simbolo
	 */
	public boolean soyIgual(Simbolo simbolo){
            if(this.numero == simbolo.getnumero() && this.simbolo.equals(simbolo.getsimbolo()))
                return true;
            else
		return false;
	}

}