/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade460;

import javax.swing.JOptionPane;

/**
 *
 * @author T-GAMER
 */
public class Atividade460 {

    public static void main(String[] args) {
        Auxiliar aux = new Auxiliar();
        
        for(aux.c=1;aux.c<=3;aux.c++){
            aux.a = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
            JOptionPane.showMessageDialog(null,"Dobro: "+aux.dob(aux.a));
        }
    }
}
