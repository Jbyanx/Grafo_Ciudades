/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import data.GrafoDinam;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class GrafoDeCiudades {
    private GrafoDinam<String, arista> grafodebuses = new GrafoDinam<>();
    private GrafoDinam<String, arista> grafodeaviones = new GrafoDinam<>();
    private GrafoDinam<String, arista> grafodetrenes = new GrafoDinam<>();

    public GrafoDinam<String, arista> getGrafodebuses() {
        return grafodebuses;
    }

    public void setGrafodebuses(GrafoDinam<String, arista> grafodebuses) {
        this.grafodebuses = grafodebuses;
    }

    public GrafoDinam<String, arista> getGrafodeaviones() {
        return grafodeaviones;
    }

    public void setGrafodeaviones(GrafoDinam<String, arista> grafodeaviones) {
        this.grafodeaviones = grafodeaviones;
    }

    public GrafoDinam<String, arista> getGrafodetrenes() {
        return grafodetrenes;
    }

    public void setGrafodetrenes(GrafoDinam<String, arista> grafodetrenes) {
        this.grafodetrenes = grafodetrenes;
    }
    
    public void grafoBuses(){
        //---------------VERTICES O CIUDADES----------------
        grafodebuses.insCiudad("Bogota");//0        
        grafodebuses.insCiudad("Medellin");//1        
        grafodebuses.insCiudad("Barranquilla");//2        
        grafodebuses.insCiudad("Cali");//3        
        grafodebuses.insCiudad("Cartagena");//4        
        grafodebuses.insCiudad("Cucuta");//5        
        grafodebuses.insCiudad("Santa marta");//6        
        grafodebuses.insCiudad("Bucaramanga");//7        
        grafodebuses.insCiudad("Manizales");//8        
        grafodebuses.insCiudad("Villavicencio");//9        
        grafodebuses.insCiudad("Monteria");//10
        grafodebuses.insCiudad("Ibague");//11
        grafodebuses.insCiudad("Pereira");//12
        grafodebuses.insCiudad("Valledupar");//13
        grafodebuses.insCiudad("Pasto");//14
        grafodebuses.insCiudad("Rioacha");//15
        grafodebuses.insCiudad("Tunja");//16
        grafodebuses.insCiudad("Popayan");//17
        grafodebuses.insCiudad("Neiva");//18
        grafodebuses.insCiudad("Yopal");//19
        
        //---------------ARISTAS----------------
        grafodebuses.insArista(0, 1, new arista(80000.0, 1, 245));
        grafodebuses.insArista(1, 2, new arista(170000.0, 13, 705));
        grafodebuses.insArista(2, 3, new arista(190000, 24, 859));
        grafodebuses.insArista(3, 4, new arista(255642, 26, 1050));
        grafodebuses.insArista(4, 5, new arista(125000, 17, 430));
        grafodebuses.insArista(5, 6,new arista(150000, 13, 627));
        grafodebuses.insArista(6, 7,new arista(100000, 10, 539));
        grafodebuses.insArista(7, 8,new arista(118000, 14, 510));
        grafodebuses.insArista(8, 9,new arista(90000, 6.5, 234));
        grafodebuses.insArista(2, 6,new arista(20000, 1, 104));
        grafodebuses.insArista(10, 11,new arista(96987, 10, 256));
        grafodebuses.insArista(11, 12,new arista(50000, 15, 800));
        grafodebuses.insArista(12, 13,new arista(67000, 7, 550));
        grafodebuses.insArista(13, 14,new arista(54050, 5, 700));
        grafodebuses.insArista(14, 15,new arista(20000, 2, 200));
        grafodebuses.insArista(15, 16,new arista(25000, 1.5, 150));
        grafodebuses.insArista(16, 17,new arista(30000, 3, 300));
        grafodebuses.insArista(17, 18,new arista(26700, 2, 280));
        grafodebuses.insArista(18, 19,new arista(40000, 4, 400)); 
        grafodebuses.insArista(0, 10,new arista(2, 2, 2));
        grafodebuses.insArista(0, 5,new arista(2, 2, 2));
        grafodebuses.insArista(0, 4,new arista(2, 2, 2));
    }
    
    public void grafoAviones(){
        //---------------VERTICES O CIUDADES----------------
        grafodeaviones.insCiudad("Bogota");//0        
        grafodeaviones.insCiudad("Medellin");//1        
        grafodeaviones.insCiudad("Barranquilla");//2        
        grafodeaviones.insCiudad("Cali");//3        
        grafodeaviones.insCiudad("Cartagena");//4        
        grafodeaviones.insCiudad("Cucuta");//5        
        grafodeaviones.insCiudad("Santa marta");//6        
        grafodeaviones.insCiudad("Bucaramanga");//7        
        grafodeaviones.insCiudad("Manizales");//8        
        grafodeaviones.insCiudad("Villavicencio");//9        
        grafodeaviones.insCiudad("Monteria");//10
        grafodeaviones.insCiudad("Ibague");//11
        grafodeaviones.insCiudad("Pereira");//12
        grafodeaviones.insCiudad("Valledupar");//13
        grafodeaviones.insCiudad("Pasto");//14
        grafodeaviones.insCiudad("Rioacha");//15
        grafodeaviones.insCiudad("Tunja");//16
        grafodeaviones.insCiudad("Popayan");//17
        grafodeaviones.insCiudad("Neiva");//18
        grafodeaviones.insCiudad("Yopal");//19
        
        //---------------ARISTAS----------------
        grafodeaviones.insArista(0, 1, new arista(180000.0, 1, 245));
        grafodeaviones.insArista(1, 2, new arista(270000.0, 13, 705));
        grafodeaviones.insArista(2, 3, new arista(230000, 24, 859));
        grafodeaviones.insArista(3, 4, new arista(555642, 26, 1050));
        grafodeaviones.insArista(4, 5, new arista(1125000, 17, 430));
        grafodeaviones.insArista(5, 6,new arista(1250000, 13, 627));
        grafodeaviones.insArista(6, 7,new arista(2100000, 10, 539));
        grafodeaviones.insArista(7, 8,new arista(2118000, 14, 510));
        grafodeaviones.insArista(8, 9,new arista(1190000, 6.5, 234));
        grafodeaviones.insArista(2, 6,new arista(2220000, 1, 104));
        grafodeaviones.insArista(10, 11,new arista(396987, 10, 256));
        grafodeaviones.insArista(11, 12,new arista(550000, 15, 800));
        grafodeaviones.insArista(12, 13,new arista(767000, 7, 550));
        grafodeaviones.insArista(13, 14,new arista(854050, 5, 700));
        grafodeaviones.insArista(14, 15,new arista(520000, 2, 200));
        grafodeaviones.insArista(15, 16,new arista(1225000, 1.5, 150));
        grafodeaviones.insArista(16, 17,new arista(330000, 3, 300));
        grafodeaviones.insArista(17, 18,new arista(526700, 2, 280));
        grafodeaviones.insArista(18, 19,new arista(940000, 4, 400));  
        grafodeaviones.insArista(6, 10,new arista(1, 1, 1));
        grafodeaviones.insArista(6, 5,new arista(1, 1, 1));
        grafodeaviones.insArista(6, 7,new arista(1, 1, 1));
    }
    
    
    public void grafoTrenes(){
        //---------------VERTICES O CIUDADES----------------
        grafodetrenes.insCiudad("Bogota");//0        
        grafodetrenes.insCiudad("Medellin");//1        
        grafodetrenes.insCiudad("Barranquilla");//2        
        grafodetrenes.insCiudad("Cali");//3        
        grafodetrenes.insCiudad("Cartagena");//4        
        grafodetrenes.insCiudad("Cucuta");//5        
        grafodetrenes.insCiudad("Santa marta");//6        
        grafodetrenes.insCiudad("Bucaramanga");//7        
        grafodetrenes.insCiudad("Manizales");//8        
        grafodetrenes.insCiudad("Villavicencio");//9        
        grafodetrenes.insCiudad("Monteria");//10
        grafodetrenes.insCiudad("Ibague");//11
        grafodetrenes.insCiudad("Pereira");//12
        grafodetrenes.insCiudad("Valledupar");//13
        grafodetrenes.insCiudad("Pasto");//14
        grafodetrenes.insCiudad("Rioacha");//15
        grafodetrenes.insCiudad("Tunja");//16
        grafodetrenes.insCiudad("Popayan");//17
        grafodetrenes.insCiudad("Neiva");//18
        grafodetrenes.insCiudad("Yopal");//19
        
        //---------------ARISTAS----------------
        grafodetrenes.insArista(0, 1, new arista(185600.0, 1, 245));
        grafodetrenes.insArista(1, 2, new arista(277600.0, 13, 705));
        grafodetrenes.insArista(2, 3, new arista(650000, 24, 859));
        grafodetrenes.insArista(3, 4, new arista(577642, 26, 1050));
        grafodetrenes.insArista(4, 5, new arista(1124300, 17, 430));
        grafodetrenes.insArista(5, 6,new arista(6750000, 13, 627));
        grafodetrenes.insArista(6, 7,new arista(215400, 10, 539));
        grafodetrenes.insArista(7, 8,new arista(211700, 14, 510));
        grafodetrenes.insArista(8, 9,new arista(119800, 6.5, 234));
        grafodetrenes.insArista(2, 6,new arista(22280, 1, 104));
        grafodetrenes.insArista(10, 11,new arista(56987, 10, 256));
        grafodetrenes.insArista(11, 12,new arista(59000, 15, 800));
        grafodetrenes.insArista(12, 13,new arista(754000, 7, 550));
        grafodetrenes.insArista(13, 14,new arista(858950, 5, 700));
        grafodetrenes.insArista(14, 15,new arista(52200, 2, 200));
        grafodetrenes.insArista(15, 16,new arista(125000, 1.5, 150));
        grafodetrenes.insArista(16, 17,new arista(33500, 3, 300));
        grafodetrenes.insArista(17, 18,new arista(528600, 2, 280));
        grafodetrenes.insArista(18, 19,new arista(94000, 4, 400));        
    }

    public String mostrar(GrafoDinam g) {
        return g.mostrar();
    }
    
    public void aislarCiudad(int pos, GrafoDinam g){
        for (int i = 0; i < g.orden(); i++) {
            g.elimArista(i, pos);
            g.elimArista(pos, i);
        }
        JOptionPane.showMessageDialog(null,"Ciudad Aislada correctamente");
    }
    
    public String ciudadConMasSalida(GrafoDinam g){
        String aux = "";
        int mayor = 0;
        for (int i = 0; i < g.orden(); i++) {
            if(g.sucesores(i).size()>mayor){
                aux = g.obtCiudad(i).toString();
                mayor = g.sucesores(i).size();
            }
            
        }
        return aux;
    }
    
    public String profundidad(GrafoDeCiudades g, int pos){
        String c="";
        c+="\n\nMaximo recorrido desde: ";
        DFS recorridoAnchura =new DFS();
        c += recorridoAnchura.profundidad(g.grafodeaviones, g.grafodeaviones.obtCiudad(pos))+"\n";
        recorridoAnchura.limpiar();
        c += "\n"+recorridoAnchura.profundidadPila(grafodeaviones, grafodeaviones.obtCiudad(pos));
        
        return c;
    }
    
    public String anchura(GrafoDeCiudades g, int pos){
        BFS recorridoAnchura =new BFS();
        recorridoAnchura.limpiar();
        
        return recorridoAnchura.anchura(g.grafodeaviones, g.grafodeaviones.obtCiudad(pos));
    }
}
