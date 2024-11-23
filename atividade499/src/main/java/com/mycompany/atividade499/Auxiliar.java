/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade499;

import javax.swing.JOptionPane;

/**
 *
 * @author T-GAMER
 */
public class Auxiliar {
    int L, flag=0, op;
    int[] num = new int[5];
    
    
    void entrada(int vet[], int t){
        int L;
        
        for(L = 0; L < t; L++){
            vet[L] = Integer.parseInt(JOptionPane.showInputDialog("ENTRADA DO VETOR\n"+"Digite o "+(L+1)+"ª numero: "));
        }
    }
    
    void imprime(int vet[], int t){
        int L;
        
        for(L = 0; L < t; L++){
            JOptionPane.showMessageDialog(null,"VETOR\n"+(L+1)+" - "+vet[L]);
        }
    }
    
    void ordena(int vet[], int tam){
        int L1, c1, aux;
        
        for(L1 = 0; L1 < tam-1; L1++){
            for(c1 = L1+1; c1 < tam; c1++){
                if(vet[L1] > vet[c1]){
                    aux = vet[L1];
                    vet[L1] = vet[c1];
                    vet[c1] = aux;
                }
            }
        }
    }
}
