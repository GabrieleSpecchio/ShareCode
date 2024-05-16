/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.appliaczioneataxxriprova;

/**
 *
 * @author Gabri
 */
import java.util.Scanner;


public class AppliaczioneAtaxxRiprova {
    
    private static final Scanner scanner = new Scanner(System.in);
    private static Partita partita;
    private static boolean partitaInCorso = false;
    
    public static void main(String[] args) {
        System.out.println("Benvenuto a Ataxx!\n");
        mostraHelp();
        boolean esecuzione = true;
        while (esecuzione) {
            System.out.print("Inserisci un comando: ");
            String input = scanner.nextLine().trim();

            switch (input) {
                case "/help":
                    mostraHelp();
                    break;
                    
                case "/gioca":
                    gioca();
                    break;
                    
                case "/vuoto":
                    
                    break;
                    
                case "/tavoliere":
                    tavoliere();
                    break;
                    
                case "/mosse":
                    mosse();
                    break;
                    
                case "/abbandona":
                    abbandona();
                    break;
                    
                case "/esci":
                    esecuzione = esci();
                    break;
                    
                default:
                    System.out.println("Comando non valido. Inserisci /help per vedere la lista dei comandi.");
                    break;
            }
        }

        System.out.println("Grazie per aver giocato!");
    }

    
    private static void gioca(){
        if (!partitaInCorso) {
            partita = new Partita();
            partitaInCorso=true;
            System.out.println("Nuova partita iniziata.\n");
            partita.tavoliere.mostraTavoliere();
            // Chiamare il metodo per mostrare il tavoliere iniziale   partita.mostraTavoliereIniziale();
           } else 
           System.out.println("Una partita è già in corso. Abbandonare la partita prima di iniziarne un'altra.\nPer abbandonare la partita corrente digitare: \"/abbandona\"");
        }
    
    
    
    private static void tavoliere(){
        if (!partitaInCorso) {
           System.out.println("Per visualizzare un tavoliere bisonga iniziare una partita. Per iniziare una partita digitare il comando: /gioca");
        }
        else
           partita.tavoliere.mostraTavoliere();
    }
    
    private static void mostraHelp() {
        System.out.println("Lista comandi:");
        System.out.println("/help - Mostra la attuale lista di comandi");
        System.out.println("/gioca - Avvia una nuova partita");
        System.out.println("/vuoto - Mostra il tavoliere vuoto con la numerazione");
        System.out.println("/tavoliere - Mostra il tavoliere con le pedine e la numerazione");
        System.out.println("/mosse - Visualizza le mosse possibili delle pedinae");
        System.out.println("/abbandona - Abbandona la partita del momento");
        System.out.println("/esci - Chiudi il gioco definitivamente");
         }


    private static void tavoliereVuoto() {
        System.out.println("Tavoliere vuoto:");
        // Da implementare la visualizzazione del tavoliere vuoto
    }


    private static void mosse() {
        System.out.println("Visualizzazione mosse possibili:");
        // Da implementare la logica per visualizzare le mosse possibili di una pedina
    }

    private static void abbandona() {
        System.out.println("Hai abbandonato la partita.");
        // Da implementare la logica per terminare la partita
    }

    private static boolean esci() {
        
       System.out.println("Sei sicuro di voler chiudere il gioco? (Sì/No)");
        Scanner lettoreRisposta = new Scanner(System.in);
        String risposta = lettoreRisposta.nextLine().trim().toLowerCase();

        if (risposta.equals("si")) {
            return false; // invio del booleano che fa terminare il ciclo
        } else if (risposta.equals("no")) {
            System.out.println("Continua a giocare!");
        } else {
            System.out.println("La risposta non è valida. Si prega di rispondere Sì o No.");
        }
        return true; // Si rimane nel ciclo
    }
    
}
