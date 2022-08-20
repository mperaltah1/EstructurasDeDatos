package test;

import estructuras.Lista;
import nodos.NodoSimple;

public class Test {
    public static void main(String[] args) {
        TestListaSimple();
    }

    static void TestListaSimple() {
        Lista ls = new Lista();
        NodoSimple nuevo = new NodoSimple(1, "UNO");
        ls.addElement(nuevo);
        nuevo = new NodoSimple(2, "DOS");
        ls.addElement(nuevo);
        nuevo = new NodoSimple(3, "TRES");
        ls.addElement(nuevo);
        ls.print();

        NodoSimple nodo = ls.search(2);
        System.out.println("NodoSimple = "+ nodo.getData());
        boolean borrado = ls.delete(3);
        System.out.println("Nodo "+ (borrado ? "borrado":"no borrado"));
        ls.print();
        boolean borrado2 = ls.deleteV2(3);
        System.out.println("Nodo " + (borrado2  ? "borrado" : "no borrado"));
        ls.print();

        nuevo = new NodoSimple(5, "Cinco");
        ls.addElement(nuevo);
        nuevo = new NodoSimple(4, "Cuatro");
        ls.addElement(3, nuevo);
        ls.print();
    }
}
