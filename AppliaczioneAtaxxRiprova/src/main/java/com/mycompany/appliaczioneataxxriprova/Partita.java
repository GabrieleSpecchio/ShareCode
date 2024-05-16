/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appliaczioneataxxriprova;

/**
 *
 * @author Gabri
 */
public class Partita {
    Tavoliere tavoliere;
    private Giocatore giocatore1;
    private Giocatore giocatore2;
    private Giocatore giocatoreCorrente;

    

    
    public Partita() {
        this.tavoliere = new Tavoliere();
        this.giocatore1 = new Giocatore(TipoPedina.BIANCO);
        this.giocatore2 = new Giocatore(TipoPedina.NERO);
        this.giocatoreCorrente = giocatore1; // Il giocatore 1 inizia per convenzione
    }
    
    
    
   public void mostraPartita(){
     //  this.tavoliere.TavoliereIniziale.    //qui gabriele deve aggiungere un metodo alla classe tavoliere in cui si mostra in output il tavoliere di inizio partita con le pedine
   }
  // boolean isInCorso(){
       
   //}
           
}