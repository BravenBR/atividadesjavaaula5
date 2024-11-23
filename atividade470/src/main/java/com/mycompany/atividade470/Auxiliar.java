/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade470;

/**
 *
 * @author T-GAMER
 */
public class Auxiliar {
    int num, pri;
    
    int primo(int n){
        int c=0,p=2;
        
        while(c == 0 && p <= n / 2){
            if(n % p == 0){
                c = 1;
            }
            p++;
        }
        return(c);
    }
}
