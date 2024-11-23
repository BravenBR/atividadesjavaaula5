/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade480;

/**
 *
 * @author T-GAMER
 */
public class Auxiliar {
    int n, x;
    
    int reverso(int num){
        int soma=0, r;
        
        while(num != 0){
            r = num % 10;
            soma = soma * 10 + r;
            num = num / 10;
            
        }
        return(soma);
    }
}
