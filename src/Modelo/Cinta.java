package Modelo;

/**
 * 
 * @created 20-Sep-2010 5:32:41 p.m.
 */
public class Cinta {

    public Cadena m_Cadena;

    public Cinta() {
    }

    public Cinta(Cadena m_Cadena) {
        this.m_Cadena = m_Cadena;
    }

    public void finalize() throws Throwable {
    }

    public void setCadena(Cadena m_Cadena) {
        this.m_Cadena = m_Cadena;
    }

    /**
     *
     * @param pos
     * @param nuevo
     * @param tipo
     */
    public int cambiarSimbolo(int pos, int nuevo, int tipo, AdminSimbolos administrador) {
        Simbolo nuevoSimbolo = null;
        if (tipo == 0) {
            nuevoSimbolo = administrador.getSimboloAlfabeto(nuevo);
        } else if (tipo == 1) {
            nuevoSimbolo = administrador.getSimboloEspecial(nuevo);
        }
        if (nuevoSimbolo == null) {
            return 0;
        } else {
            this.m_Cadena.cambiarSimbolo(pos, nuevoSimbolo);
        }
        return 1;
    }

    public void cambiarSimbolo(int pos, Simbolo nuevo) {
        this.m_Cadena.cambiarSimbolo(pos, nuevo);
    }

    public Cadena getCadena() {
        return this.m_Cadena;
    }

    public String getCadenaActual() {
        return this.m_Cadena.getCadenaActual();
    }

    public Simbolo Update() {
        return this.m_Cadena.getActual();
    }

    public Simbolo moverCabezalDerecha() {
        return this.m_Cadena.moverDerecha();
    }

    public void configurarCabezal() {
        this.m_Cadena.configurarIterator();
    }

    public int getPocisionDeLaCinta() {
        return this.m_Cadena.indexActual();
    }

    public Simbolo moverEnDireccion(int direccion) {
        System.out.println("Moviendo cabezal");
        if(Enlace.DERECHA == direccion){
            System.out.println("direccion: DERECHA");
            return this.m_Cadena.moverDerecha();
        }else if(Enlace.IZQUIERDA == direccion){
            System.out.println("direccion: IZQUIERDA");
            return this.m_Cadena.moverIzquierda();
        }else if(Enlace.NOMOVER == direccion){
            System.out.println("direccion: NOMOVER");
            return this.m_Cadena.moverNO();
        }else{
            System.out.println("direccion: Error no se movio a ningun lado----------------");
            return null;
        }
    }
}
