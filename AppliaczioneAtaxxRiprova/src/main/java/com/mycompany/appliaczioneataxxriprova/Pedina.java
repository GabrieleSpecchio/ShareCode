/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appliaczioneataxxriprova;

/**
 *
 * @author Gabri
 */
public class Pedina {
    private TipoPedina tipo; // Tipo della pedina (bianco o nero)
    private char display; // Simbolo di visualizzazione della pedina sul tavoliere

    public Pedina(TipoPedina tipo) {
        this.tipo = tipo;
        this.display = (tipo == TipoPedina.BIANCO) ? '\u26c0' : '\u26c2'; // '\u26C0' per bianco, '\u26C0' per nero
    }

    public TipoPedina getType() {
        return tipo;
    }

    public char getDisplay() {
        return display;
    }
}