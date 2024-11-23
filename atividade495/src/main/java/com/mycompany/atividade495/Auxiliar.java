/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade495;

/**
 *
 * @author User
 */
public class Auxiliar {
    int L, c, t, t1;
    String[] nome = new String[5];
    
    
    void ordena(String vet[], int tam){
        int L1, c1;
        String aux;
        
        for(L1 = 0; L1 < tam-1; L1++){
            for(c1 = L1+1; c1 < tam; c1++){
                if(vet[L1].compareTo(vet[c1])>0){
                    aux = vet[L1];
                    vet[L1] = vet[c1];
                    vet[c1] = aux;
                }
            }
        }
    }
}
