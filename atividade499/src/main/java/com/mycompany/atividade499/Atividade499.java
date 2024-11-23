/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade499;

import javax.swing.JOptionPane;

/**
 *
 * @author T-GAMER
 */
public class Atividade499 {

    public static void main(String[] args) {
        Auxiliar aux = new Auxiliar();
        
        
        for(aux.L = 0; aux.L < 5; aux.L++){
            aux.num[aux.L] = 0;
        }
        
        do{
            aux.op = Integer.parseInt(JOptionPane.showInputDialog("MENU VETOR - FUNCAO\n"+"1- Dados do vetor\n"+"2- Ordena o vetor\n"+"3- Imprime o vetor\n"+"4- Sai do programa\n"+"OPCAO: "));
            switch(aux.op){
                case 1: 
                    aux.entrada(aux.num, 5);
                    aux.flag = 1;
                    break;
                case 2: 
                    if(aux.flag == 1){
                        aux.ordena(aux.num, 5);
                    }else{
                        JOptionPane.showMessageDialog(null, "Escolha primeiro a opcao 1");
                    }
                    break;
                case 3: 
                    if( aux.flag == 1){
                        aux.imprime(aux.num, 5);
                    }else{
                        JOptionPane.showMessageDialog(null, "Escolha primeiro a opcao 1");
                    }
                    break;
                case 4: 
                    JOptionPane.showMessageDialog(null, "Saindo do algoritmo");
                    break;
                default: 
                    JOptionPane.showMessageDialog(null, "Opcao invalida");
            }
        }while(aux.op != 4);
    }
}   
