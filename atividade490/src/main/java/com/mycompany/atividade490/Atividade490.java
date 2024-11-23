/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade490;

import javax.swing.JOptionPane;

/**
 *
 * @author T-GAMER
 */

public class Atividade490 {

    public static void main(String[] args) {
        Auxiliar aux = new Auxiliar();

        for (aux.L = 0; aux.L < 10; aux.L++) {
            aux.nome[aux.L] = JOptionPane.showInputDialog("Digite a " + (aux.L + 1) + "ª palavra usando somente letras minúsculas ");
        }
        for (aux.L = 0; aux.L < 10; aux.L++) {
            aux.restantes(aux.nome[aux.L], "c");
            JOptionPane.showMessageDialog(null,(aux.L + 1) + "ª - " + aux.nome[aux.L]);
        }
        
    }
}
