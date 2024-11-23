/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade500;

import javax.swing.JOptionPane;

/**
 *
 * @author T-GAMER
 */
public class Auxiliar {
    int[] num = new int[5], num1 = new int[5];
    int L, flag=0, flag1=0, op;
    
    void entrada(int vet[], int t, String c){
        int L;
        
        for(L = 0; L < t; L++){
            vet[L] = Integer.parseInt(JOptionPane.showInputDialog("ENTRADA DO VETOR\n"+"Digite o "+(L+1)+"ª numero: "));
        }
    }
    
    void imprime(int vet[], int t, String c){
        int L;
        
        for(L = 0; L < t; L++){
            JOptionPane.showMessageDialog(null,"VETOR "+c+"\n"+(L+1)+" - "+vet[L]);
        }
    }
    
    void soma(int vet[], int vet1[], int t){
        int L, s;
        
        for(L = 0; L < t; L++){
            s = vet[L] + vet1[L];
            JOptionPane.showMessageDialog(null, "SOMA\n"+s);
        }
    }
    
    void subtrai(int vet[], int vet1[], int t){
        int L, d;
        
        for(L = 0; L < t; L++){
            d = vet[L] - vet1[L];
            JOptionPane.showMessageDialog(null,"DIFERENCA\n"+d);
        }
    }
}
