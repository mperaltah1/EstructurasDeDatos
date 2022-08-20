package nodos;

public class NodoSimple {
    private int num;
    private String data;
    private NodoSimple next;


    public NodoSimple(int num, String data) {
        this.num = num;
        this.data = data;
        this.next = null;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public NodoSimple getNext() {
        return next;
    }

    public void setNext(NodoSimple next) {
        this.next = next;
    }
}
