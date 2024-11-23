/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade490;

/**
 *
 * @author T-GAMER
 */

public class Auxiliar {
    String[] nome = new String[10];
    int L;

    int restantes(String palavra, String x) {
        int cont = 0;
        char[] chars = palavra.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (String.valueOf(chars[i]).equals(x)) {
                chars[i] = '*';
                cont++;
            }
        }
        nome[L] = new String(chars);
        return (cont);
    }
}
