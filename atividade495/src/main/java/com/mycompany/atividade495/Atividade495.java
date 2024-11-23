/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade495;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Atividade495 {

    public static void main(String[] args) {
        Auxiliar aux = new Auxiliar();
        
        for(aux.L=0;aux.L<5;aux.L++){
            aux.nome[aux.L] = JOptionPane.showInputDialog("Digite o nome: ");
        }
        aux.ordena(aux.nome, 5);
        
        for(aux.L=0;aux.L<5;aux.L++){
            JOptionPane.showMessageDialog(null,(aux.L+1)+" - "+aux.nome[aux.L]);
        }
    }
}
