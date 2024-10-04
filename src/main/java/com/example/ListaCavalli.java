package com.example;

import java.util.ArrayList;

public class ListaCavalli extends ArrayList<Cavalli> {

    ArrayList<Cavalli> lista;

    public ListaCavalli(){
        this.lista = new ArrayList<Cavalli>();
    }

    public void addCavalli(Cavalli c){
        lista.add(c);
    }
    
}
