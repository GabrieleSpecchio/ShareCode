/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appliaczioneataxxriprova;

/**
 *
 * @author Gabri
 */
public class Casella {
    private boolean isEmpty;
    private Pedina pedina;

    public Casella() {
        this.isEmpty = true; // Inizialmente la cella è vuota
        this.pedina = null; // Non c'è pedina sulla cella
    }

    public void setPiece(Pedina pedina) {
        this.pedina = pedina; // Imposta la pedina sulla casella
        this.isEmpty= false;
    }
    
    public boolean isEmpty() {
        return isEmpty;
    }

    public void posizionaPedina(Pedina pedina) {
        this.pedina = pedina;
        this.isEmpty = false;
    }

    public void rimuoviPedina() {
        this.pedina = null;
        this.isEmpty = true;
    }

    public Pedina getPiece() {
        return pedina;
    }
}