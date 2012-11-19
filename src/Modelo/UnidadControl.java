package Modelo;

/**
 * 
 * @created 20-Sep-2010 5:32:57 p.m.
 */
public class UnidadControl {

    private Estado actual;
    private Simbolo simboloActual;
    private int simboloActualCinta;
    private Enlace enlaceEncontrado = null;

    public UnidadControl() {
    }

    public void finalize() throws Throwable {
    }

    public Enlace getEnlaceEncontrado() {
        return enlaceEncontrado;
    }

    public void setEnlaceEncontrado(Enlace enlaceEncontrado) {
        this.enlaceEncontrado = enlaceEncontrado;
    }

    public Estado getActual() {
        return actual;
    }

    public void setActual(Estado actual) {
        this.actual = actual;
    }

    public Simbolo getSimboloActual() {
        return simboloActual;
    }

    public void setSimboloActual(Simbolo simboloActual) {
        this.simboloActual = simboloActual;
    }

    public int getSimboloActualCinta() {
        return simboloActualCinta;
    }

    public void setSimboloActualCinta(int simboloActualCinta) {
        this.simboloActualCinta = simboloActualCinta;
    }

    public void configurarMaquina() {
    }

    public void setStateInicial(Estado estadoInicial) {
        this.setActual(estadoInicial);
    }

    public Estado getStateIncial() {
        return this.actual;
    }

    public boolean ejecutarTrancicion() {
        //this.enlaceEncontrado = null;
        System.out.println("Buscando el enlace en el estado de la unidad");
        this.enlaceEncontrado = this.actual.getEnlace(this.simboloActual.simbolo);
        if(this.enlaceEncontrado != null){
            System.out.println("Enlace encontrado");
            return true;
        }else{
            System.out.println("Enlace NULL no hay enlace");
            return false;
        }
    }
}
