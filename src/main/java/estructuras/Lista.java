package estructuras;

import nodos.NodoSimple;

public class Lista {
    NodoSimple primero;

    public Lista() {
        this.primero = null;
    }

    public void addElement(final NodoSimple nuevo) {
        if (isEmpty()) {
            primero = nuevo;
        } else {
            NodoSimple aux = primero;
            while (aux.getNext() != null) {
                aux = aux.getNext();
            }
            aux.setNext(nuevo);
        }
    }

    public void addElement(int numNodo1, NodoSimple nuevo) {
        if (isEmpty()) {
            return;
        }
        NodoSimple anterior = search(numNodo1);
        nuevo.setNext(anterior.getNext());
        anterior.setNext(nuevo);

    }

    public NodoSimple search(final int num) {
        if (isEmpty()) {
            return null;
        }
        NodoSimple aux = primero;
        while (aux != null) {
            if (aux.getNum() == num) {
                return aux;
            }
            aux = aux.getNext();
        }
        return null;
    }

    public boolean update(final int num, final String data) {
        final NodoSimple aux = search(num);
        if (aux == null) {
            return false;
        }
        aux.setData(data);
        return true;
    }

    public boolean delete(final int num) {
        if (isEmpty()) {
            return false;
        }
        if (primero.getNum() == num) {
            primero = primero.getNext();
            return true;
        }
        NodoSimple anterior = primero;
        NodoSimple aux = primero.getNext();
        while (aux != null) {
            if (aux.getNum() == num) {
                anterior.setNext(aux.getNext());
                return true;
            }
            anterior = aux;
            aux = aux.getNext();
        }
        return false;
    }

    public boolean deleteV2(final int num) {
        if (isEmpty()) {
            return false;
        }
        if (primero.getNum() == num) {
            primero = primero.getNext();
            return true;
        }
        NodoSimple aux = primero;

        while (aux.getNext() != null) {
            if (aux.getNext().getNum() == num) {
                aux.setNext(aux.getNext().getNext());
                return true;
            }
            aux = aux.getNext();
        }
        return false;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Lista Vacia");
            return;
        }
        NodoSimple aux = primero;
        while (aux != null) {
            System.out.println(aux.getNum());
            aux = aux.getNext();
        }
    }


    private boolean isEmpty() {
        return primero == null;
    }

}
