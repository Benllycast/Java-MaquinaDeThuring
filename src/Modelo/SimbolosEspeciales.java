package Modelo;

/**
 * 
 * @created 20-Sep-2010 5:32:55 p.m.
 */
public class SimbolosEspeciales extends Conjunto {

	public SimbolosEspeciales(){
            agregarSimbolo(new Simbolo("#"));
            agregarSimbolo(new Simbolo(">"));
            agregarSimbolo(new Simbolo("^"));
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

}