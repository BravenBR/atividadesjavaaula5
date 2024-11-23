/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade470;

import javax.swing.JOptionPane;

/**
 *
 * @author T-GAMER
 */
public class Atividade470 {

    public static void main(String[] args) {
        Auxiliar aux = new Auxiliar();
        
        
        aux.num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero maior que 0: "));
        
        aux.pri = aux.primo(aux.num);
        
        if(aux.pri == 0){
            JOptionPane.showMessageDialog(null,aux.num+" E primo");
        }else{
            JOptionPane.showMessageDialog(null,aux.num+" Nao e primo");
        }
    }
}
