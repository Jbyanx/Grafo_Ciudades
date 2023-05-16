/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Vertice<T, A> {private T vertice;
    private ArrayList<Arista<T,A>> aristas = new ArrayList<>();

    public Vertice(T vertice) {
        this.vertice = vertice;
    }

    @Override
    public String toString() {
        return "Vertice{" + "vertice=" + vertice + '}';
    }
    
    public void addArista(Arista<T,A> arista){
        aristas.add(arista);
    }
    
    public T getVertice() {
        return vertice;
    }

    public void setVertice(T vertice) {
        this.vertice = vertice;
    }

    public ArrayList<Arista<T, A>> getAristas() {
        return aristas;
    }
}
