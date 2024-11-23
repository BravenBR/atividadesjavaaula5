/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade497;

import javax.swing.JOptionPane;

/**
 *
 * @author T-GAMER
 */
public class Atividade497 {

    public static void main(String[] args) {
        Auxiliar aux = new Auxiliar();
        
        
        for(aux.L = 0; aux.L < 10; aux.L++){
            aux.num[aux.L] = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+(aux.L+1)+"ª numero: "));
        }
        
        aux.n = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de busca: "));
        aux.ordena(aux.num, 10);
        aux.c = aux.busca(aux.num, 10, aux.n);
        
        for(aux.L = 0; aux.L < 10; aux.L++){
            JOptionPane.showMessageDialog(null,(aux.L+1)+"ª - "+aux.num[aux.L]);
        }
        aux.c++;
        if(aux.c != 0){
            JOptionPane.showMessageDialog(null,"Posicao no vetor: "+aux.c);
        }else{
            JOptionPane.showMessageDialog(null,"Nao encontrado");
        }
    }
}
