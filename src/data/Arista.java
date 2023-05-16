/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author HP
 */
public class Arista<T, A> {private T sucesor;
    private A costo;

    public Arista(T vertice, A costo) {
        this.sucesor = vertice;
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Arista{" + "sucesor=" + sucesor + ", costo=" + costo + '}';
    }

    public T getSucesor() {
        return sucesor;
    }

    public void setSucesor(T vertice) {
        this.sucesor = vertice;
    }

    public A getCosto() {
        return costo;
    }

    public void setCosto(A costo) {
        this.costo = costo;
    }
}
