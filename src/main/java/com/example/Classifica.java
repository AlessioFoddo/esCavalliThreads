package com.example;

import java.util.ArrayList;

public class Classifica extends ArrayList<Cavalli> {

    private final ArrayList<Cavalli> lista;

    public Classifica(){
        lista = new ArrayList<>();
    }

    public void addCavalli(Cavalli c){
        lista.add(c);
    }

    public String getCavallo(int pos){
        return lista.get(pos).getNome();
    }

    public void stampa(){
        System.out.println("classifica Finale:");
        for(int i = 0; i < lista.size(); i++){
            System.out.println((i+1) + ". " + lista.get(i).getNome());
        }
    }
    
}