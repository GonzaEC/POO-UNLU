package ar.com.poo;

public class Lista {
    private Nodo cabeza;
    private int cantidad;

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
            cantidad++;
            return;
        }
        Nodo nodoActual = this.cabeza;
        while (nodoActual.getSiguiente() != null) {
            nodoActual = nodoActual.getSiguiente();
        }
        nodoActual.setSiguiente(nuevoNodo);
        cantidad++;
    }
    public void eliminar(int elemento) {
        Nodo nodoActual = this.cabeza;
        Nodo nuevoNodo = this.cabeza;
        while (nodoActual.getElemento() != elemento) {
            nuevoNodo = nodoActual;
            nodoActual = nodoActual.getSiguiente();
        }
        Nodo siguiente = nodoActual.getSiguiente();
        nuevoNodo.setSiguiente(siguiente);
        cantidad--;
    }

    public void mostrar() {
        Nodo nodoActual = this.cabeza;
        if(nodoActual == null) {
            System.out.println("Lista vacia");
            return;
        }
        System.out.println("Elemento: " + nodoActual.getElemento());
        while (nodoActual.getSiguiente() != null) {
            nodoActual = nodoActual.getSiguiente();
            System.out.println("Elemento: " + nodoActual.getElemento());


        }
    }
    public void borrar(int elemento) {
        Nodo nodoActual = this.cabeza;
        for (int i = 0; i < cantidad ; i++) {
            if (elemento == nodoActual.getElemento()){

            }
        }
    }

}