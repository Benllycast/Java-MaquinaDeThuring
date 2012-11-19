package Modelo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * 
 * @created 20-Sep-2010 5:32:41 p.m.
 */
public class Cadena {

    public int cant_simbolos;
    List<Simbolo> listaSimbolos;
    ListIterator<Simbolo> iterator;

    public Cadena() {
        this.listaSimbolos = new LinkedList<Simbolo>();
        this.iterator = this.listaSimbolos.listIterator();
    }

    public void finalize() throws Throwable {
    }

    public int getCant_simbolos() {
        return cant_simbolos;
    }

    public void setCant_simbolos(int cant_simbolos) {
        this.cant_simbolos = cant_simbolos;
    }

    public List<Simbolo> getListaSimbolos() {
        return listaSimbolos;
    }

    public void setListaSimbolos(List<Simbolo> listaSimbolos) {
        this.listaSimbolos = listaSimbolos;
    }

    public ListIterator<Simbolo> getIterator() {
        return iterator;
    }

    public void setIterator(ListIterator<Simbolo> iterator) {
        this.iterator = iterator;
    }

    /**
     *
     * @param tipo
     * @param posicion
     */
    public boolean agregarSimbolo(String tipo, int posicion) {
        return false;
    }

    public boolean agregarSimbolo(AdminSimbolos conjunto, String simbolo) {
        Simbolo aIngresar = conjunto.getSimbolo(simbolo);
        if (aIngresar != null) {
            listaSimbolos.add(aIngresar);
            this.cant_simbolos = listaSimbolos.size();
            return true;
        }
        return false;
    }

    /**
     *
     * @param pos
     * @param simbolo
     */
    public boolean cambiarSimbolo(int pos, Simbolo destino) {
        System.out.println("Cambiando Simbolos");
        if (destino != null) {
                    System.out.println("nuevo:"+destino.getsimbolo());
            Simbolo cambiado = listaSimbolos.set(pos, destino);
                    System.out.println("viejo:"+cambiado.getsimbolo());
            return true;
        }
        System.out.println("no cambio nada");
        return false;
    }

    public void resetAll(AdminSimbolos conjunto) {
        listaSimbolos.removeAll(conjunto.getTodoAlfabeto());
        listaSimbolos.removeAll(conjunto.getTodoEspeciales());
    }

    public Simbolo moverDerecha() {
        if (this.iterator.hasNext()) {
            return (Simbolo) iterator.next();
        } else {
            return null;
        }
    }

    public Simbolo moverIzquierda() {
        if (this.iterator.hasPrevious()) {
            return (Simbolo) iterator.previous();
        } else {
            return null;
        }
    }

    public Simbolo moverNO() {
        return (Simbolo) this.listaSimbolos.get(iterator.nextIndex());//iterator;-1
    }

    public String getCadenaActual() {
        Iterator<Simbolo> i = listaSimbolos.iterator();
        String cadena = new String("");
        while (i.hasNext()) {
            cadena += ((Simbolo) i.next()).getsimbolo();
        }
        return cadena;
    }

    public int indexActual() {
        return iterator.nextIndex();//?-1
    }

    public int indexPrevio() {
        return iterator.previousIndex();//?-1
    }

    public Simbolo getActual() {
        return (Simbolo) this.listaSimbolos.get(iterator.nextIndex());
    }

    public void configurarIterator() {
        this.iterator = this.listaSimbolos.listIterator();
    }
}
