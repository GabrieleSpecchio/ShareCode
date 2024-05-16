/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appliaczioneataxxriprova;

/**
 *
 * @author Gabri
 */
public class Tavoliere {
    
    private Casella caselle[][];
    private int DIM=7;
    
    
    public Tavoliere() {
        this.caselle = new Casella[DIM][DIM];
        
        inizializzaTavoliere();
        // chiama metodo di gabriele per popolare il tavoliere come inizio cioé pedine su a1 a7 g1 g7
        posizionaPedineIniziali();
        
    }
    
    private void inizializzaTavoliere() {
        for (int riga = 0; riga < DIM; riga++) {
            for (int colonna = 0; colonna < DIM; colonna++) {
                caselle[riga][colonna] = new Casella(); // Inizializza ogni cella del tavoliere
            }
        }
    }
    
    private void posizionaPedineIniziali() {
        // Posiziona le pedine iniziali sul tavoliere
        caselle[0][0].setPiece(new Pedina(TipoPedina.BIANCO));  // Pedina bianca in a1
        caselle[6][0].setPiece(new Pedina(TipoPedina.NERO));  // Pedina bianca in a7
        caselle[0][6].setPiece(new Pedina(TipoPedina.NERO));    // Pedina nera in g1
        caselle[6][6].setPiece(new Pedina(TipoPedina.BIANCO));    // Pedina nera in g7
    }
    
    public void mostraTavoliere() {
        System.out.println("Tavoliere con pedine:");
        System.out.println("\n      a       b       c       d       e       f       g");
   String barraOrizzontale = "  +-------+-------+-------+-------+-------+-------+-------+";
        // Stampa il tavoliere
        System.out.println(barraOrizzontale); // stampa la prima riga della griglia
        for (int riga = 0; riga < DIM; riga++) {
            System.out.print((riga + 1) + " "); // etichette per le righe, stampa da 1 a 7.
            for (int col = 0; col < DIM; col++) {
                if (caselle[riga][col].isEmpty()) {
                    System.out.print("|   " +"\t  ");
                } else {
                    Pedina pedina = caselle[riga][col].getPiece();
                    String display = (pedina.getType() == TipoPedina.BIANCO) ? "\u26c0" : "\u26c2";
                    System.out.print("|   " +display + "\t  ");
                }
            }
            System.out.println("| " + (riga + 1) + "\t\n" + barraOrizzontale); // ultima riga e fine della griglia.
        }
        System.out.println("      a       b       c       d       e       f       g\n");
    }
   
}