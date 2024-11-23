/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade480;

import javax.swing.JOptionPane;

/**
 *
 * @author T-GAMER
 */
public class Atividade480 {

    public static void main(String[] args) {
        Auxiliar aux = new Auxiliar();
        
        
        aux.n = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
        aux.x = aux.reverso(aux.n);
        JOptionPane.showMessageDialog(null,aux.n+" - "+aux.x);
        
        if(aux.x == aux.n){
            JOptionPane.showMessageDialog(null,"E um numero capicua");
        }else{
            JOptionPane.showMessageDialog(null,"Nao e um numero capicua");
        }
    }
}
