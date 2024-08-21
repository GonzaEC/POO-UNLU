package com.clase.poo;

public class Nodo {
    private int elemento;
    private Nodo siguiente;

    public Nodo(int nuevoElemento) {
        this.elemento = nuevoElemento;
        this.siguiente = null;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public int getElemento() {
        return this.elemento;
    }

    public Nodo getSiguiente() {
        return this.siguiente;
    }

}



