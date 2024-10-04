package com.example;

public class Cavalli extends Thread {

    private String nome;
    private final Classifica lista;

    public void run() {
        try {
            Thread.sleep((int) (Math.random() * 1000));
            Thread.sleep((int) (Math.random() * 5000));
            lista.addCavalli(this);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getNome() {
        return nome;
    }

    public Cavalli(String nome, Classifica lista) {
        this.nome = nome;
        this.lista = lista;
    }

}
