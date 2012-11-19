package Modelo;

/**
 * 
 * @created 20-Sep-2010 5:32:54 p.m.
 */
public class MaquinaTuring {

    private EstadosFinales m_EstadosFinales;
    private ConjuntoEstados m_CojuntoEstados;
    private Cinta m_Cinta;
    private UnidadControl m_UnidadControl;
    private boolean pararMaquina = false;


    public MaquinaTuring() {
    }

    public MaquinaTuring(EstadosFinales m_EstadosFinales, ConjuntoEstados m_CojuntoEstados, Cinta m_Cinta, UnidadControl m_UnidadControl) {
        this.m_EstadosFinales = m_EstadosFinales;
        this.m_CojuntoEstados = m_CojuntoEstados;
        this.m_Cinta = m_Cinta;
        this.m_UnidadControl = m_UnidadControl;
    }

    public boolean isPararMaquina() {
        return pararMaquina;
    }

    public void setPararMaquina(boolean pararMaquina) {
        this.pararMaquina = pararMaquina;
    }


    public Cinta getM_Cinta() {
        return m_Cinta;
    }

    public void setM_Cinta(Cinta m_Cinta) {
        this.m_Cinta = m_Cinta;
    }

    public ConjuntoEstados getM_CojuntoEstados() {
        return m_CojuntoEstados;
    }

    public void setM_CojuntoEstados(ConjuntoEstados m_CojuntoEstados) {
        this.m_CojuntoEstados = m_CojuntoEstados;
    }

    public EstadosFinales getM_EstadosFinales() {
        return m_EstadosFinales;
    }

    public void setM_EstadosFinales(EstadosFinales m_EstadosFinales) {
        this.m_EstadosFinales = m_EstadosFinales;
    }

    public UnidadControl getM_UnidadControl() {
        return m_UnidadControl;
    }

    public void setM_UnidadControl(UnidadControl m_UnidadControl) {
        this.m_UnidadControl = m_UnidadControl;
    }

    public void finalize() throws Throwable {
    }

    public void configurarMaquina() {
        //coloca el cabezal en el primer simbolo del alfabeto
        this.m_Cinta.configurarCabezal();
        while (this.m_Cinta.getCadena().getActual().getsimbolo().equals("#")) {
            System.out.println("\n\nAntes: " + this.m_Cinta.getCadena().getActual().getsimbolo());
            this.m_Cinta.moverCabezalDerecha();
            System.out.println("Despues: " + this.m_Cinta.getCadena().getActual().getsimbolo());
        }
    }

    public void siguiente() {
        Simbolo actual = this.m_Cinta.Update();
        this.m_UnidadControl.setSimboloActual(actual);
        if(this.m_UnidadControl.ejecutarTrancicion()){
            this.m_UnidadControl.setActual(this.m_UnidadControl.getEnlaceEncontrado().getstate());
            this.m_Cinta.cambiarSimbolo(this.m_Cinta.getPocisionDeLaCinta(), this.m_UnidadControl.getEnlaceEncontrado().getsimbolo());
            Simbolo nuevo = this.m_Cinta.moverEnDireccion(this.m_UnidadControl.getEnlaceEncontrado().getDireccion());
            System.out.println("Simbolo nuevo:"+nuevo.getsimbolo()+" Numero: "+nuevo.getnumero()+"\n---------------------\n");
            this.pararMaquina = false;
        }else{
            System.out.println("Deteniendo Maquina");
            this.pararMaquina = true;
        }
    }
}
