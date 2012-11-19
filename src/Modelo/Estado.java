package Modelo;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @created 20-Sep-2010 5:32:51 p.m.
 */
public class Estado {

	private int cant_in = 0;
	private int cant_out = 0;
	private String nombre;
	private int num_Estado;
        HashMap<String, Enlace> enlaces = new HashMap<String, Enlace>();

	public Estado(){
            num_Estado = Modelo.ConjuntoEstados.num_estados++;
            nombre = "q"+num_Estado;
            cant_out = enlaces.size();

	}

        public Estado(String nombre){
            nombre.trim();
            if(!nombre.equalsIgnoreCase("")&&!nombre.equalsIgnoreCase(" ")){
                setnombre(nombre);
                num_Estado = Modelo.ConjuntoEstados.num_estados++;
            }
            cant_out = enlaces.size();
        }

	public void finalize() throws Throwable {

	}

	public int getcant_in(){
		return cant_in;
	}

	public int getcant_out(){
		return cant_out;
	}

	public String getnombre(){
		return nombre;
	}

	
        public int getNum_Estado() {
            return num_Estado;
        }

        public HashMap<String, Enlace> getEnlaces() {
            return enlaces;
        }



	/**
	 * 
	 * @param newVal
	 */
	public void setcant_in(int newVal){
		cant_in = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setcant_out(int newVal){
		cant_out = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setnombre(String newVal){
		nombre = newVal;
	}
	
        public void setNum_Estado(int num_Estado) {
            this.num_Estado = num_Estado;
        }

        boolean esIgual(Estado estado) {
            return (this.nombre.equals(estado.getnombre()))? true:false;
        }

        public int agregarEnlace(String simbolo,Enlace enlace){
            if(!enlaces.containsKey(simbolo)){
                enlaces.put(simbolo, enlace);
                cant_out = enlaces.size();
                return 1;
            }
            return 0;
        }

        public Enlace getEnlace(String simbolo){
            return (Enlace)enlaces.get(simbolo);
        }


}