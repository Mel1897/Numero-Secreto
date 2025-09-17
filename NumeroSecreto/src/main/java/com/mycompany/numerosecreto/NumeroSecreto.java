/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numerosecreto;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Melissa Martins dos Santos
 */
public class NumeroSecreto {
    public static void main(String[] args) {
        Random NumRandom = new Random();
        Scanner entrada = new Scanner(System.in);

        int NumeroSecreto = NumRandom.nextInt(1, 11);
        int palpite;
        int TotaldeTentativas = 0;

        System.out.println("Jogo de Adivinhacao");
        System.out.println("Tente adivinhar o numero entre 1 a 10!");

        do {
            System.out.print("Digite seu palpite: ");
            palpite = entrada.nextInt();

            TotaldeTentativas = TotaldeTentativas + 1;

            if (palpite < NumeroSecreto) {
                System.out.println("O numero e maior!");
            } else if (palpite > NumeroSecreto) {
                System.out.println("O numero e menor!");
                
                            System.out.println("Voce teve: " + TotaldeTentativas + " tentativas.");
            
            }

        } while (palpite != NumeroSecreto);
        
        
       
        if (TotaldeTentativas < 1) {
            System.out.println("Meus parabens, você acertou de primeira!");
        }else{
            
            System.out.println("Parabens, voce acertou o numero " + NumeroSecreto);
            System.out.println("Voce precisou de: " + TotaldeTentativas + " tentativas.");
            
        
            

        entrada.close();
        
    }
    }
}
  

