package com.clase.poo;

public class Lista {
    private Nodo cabeza;

    public Lista() {
        this.cabeza = null;
    }

    public boolean isVacia() {
        return this.cabeza == null;
    }

    public void agregar(int elemento) {
        Nodo nuevoNodo = new Nodo(elemento);
        if (this.isVacia()) {
            this.cabeza = nuevoNodo;
            return;
        }
        Nodo nodoActual = this.cabeza;
        while (nodoActual.getSiguiente() != null) {
            nodoActual = nodoActual.getSiguiente();
        }
        nodoActual.setSiguiente(nuevoNodo);
    }

    public void eliminar(int elemento){
        Nodo nodoActual = this.cabeza;
        while (nodoActual.getSiguiente() != null){
            if(nodoActual.getSiguiente().getElemento() == elemento){
                Nodo nodoSiguiente = nodoActual.getSiguiente();
                nodoActual.setSiguiente(nodoSiguiente.getSiguiente());
            }
        }
    }

    public void mostrar(){
        if (this.isVacia()) {
            return;
        }
        Nodo nodoActual = this.cabeza;
        while (nodoActual.getSiguiente() != null) {
            System.out.println("Elemento: " + nodoActual.getElemento());
            nodoActual = nodoActual.getSiguiente();
        }

    }
}
