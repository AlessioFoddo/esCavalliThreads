package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Cavalli[] lista = new Cavalli[20];
        Classifica classifica = new Classifica();
        for(int i = 0; i < 20; i++){
            Cavalli c = new Cavalli("cavallo " + i, classifica);
            lista[i] = c;
            lista[i].start();
        }

        for (Cavalli cavalli : lista) {
            try {
                cavalli.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        classifica.stampa();

    }
}