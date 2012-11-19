package Modelo;

/**
 * 
 * @created 20-Sep-2010 5:38:56 p.m.
 */
public abstract class FuncionTrancision {

	public FuncionTrancision(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param cinta
	 * @param tablaTrancision
	 * @param unidad
	 */
	public int ejecutarCambio(Cinta cinta, TablaTrancision tablaTrancision, UnidadControl unidad){
		return 0;
	}

	/**
	 * 
	 * @param unidad
	 */
	public int updateUnidad(UnidadControl unidad){
		return 0;
	}

}