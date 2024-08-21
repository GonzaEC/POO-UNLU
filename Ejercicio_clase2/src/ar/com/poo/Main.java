package ar.com.poo;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.agregar(7);
        lista.agregar(9);
        lista.agregar(2);
        lista.mostrar();

        lista.eliminar(9);
        lista.mostrar();
    }
}
