/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade500;

import javax.swing.JOptionPane;

/**
 *
 * @author T-GAMER
 */
public class Atividade500 {

    public static void main(String[] args) {
        Auxiliar aux = new Auxiliar();
        
        
        for(aux.L = 0; aux.L < 5; aux.L++){
            aux.num[aux.L] = 0;
            aux.num1[aux.L] = 0;
        }
        
        do{
            aux.op =Integer.parseInt(JOptionPane.showInputDialog("VETORES"+
                                               "\n1 - Dados do vetor A"+
                                               "\n2 - Dados do vetor B"+
                                               "\n3 - Imprime vetores"+
                                               "\n4 - Soma dos vetores"+
                                               "\n5 - Subtrai os vetores"+
                                               "\n6 - Sai do programa"+
                                               "\nOPCAO: "
            ));
            
            switch(aux.op){
                case 1:
                    aux.entrada(aux.num, 5, "A");
                    aux.flag = 1;
                    break;
                case 2:
                    aux.entrada(aux.num1, 5, "B");
                    aux.flag1 = 1;
                    break;
                case 3:
                    if(aux.flag != 0 && aux.flag1 != 0){
                        aux.imprime(aux.num, 5, "A");
                        aux.imprime(aux.num1, 5, "B");
                    }else{
                        JOptionPane.showMessageDialog(null,"Escolha a primeiro as opcoes 1 e 2");
                    }
                    break;
                case 4:
                    if(aux.flag != 0 && aux.flag1 != 0){
                        aux.soma(aux.num,aux.num1,5);
                    }else{
                        JOptionPane.showMessageDialog(null,"Escolha a primeiro as opcoes 1 e 2");
                    }
                    break;
                case 5:
                    if(aux.flag != 0 && aux.flag1 != 0){
                        aux.subtrai(aux.num,aux.num1,5);
                    }else{
                        JOptionPane.showMessageDialog(null,"Escolha a primeiro as opcoes 1 e 2");
                    }
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null,"Saindo do algoritmo");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opcao invalida");
            }
        }while(aux.op != 6);
    }
}
